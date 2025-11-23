#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#define FILE_NAME "data.txt"

int main() {
    int pipe_fd[2];  // File descriptors for the pipe
    pid_t pid;
    char buffer[1024];

    // Create a pipe
    if (pipe(pipe_fd) == -1) {
        perror("pipe failed");
        return 1;
    }

    // Open the file for reading
    FILE *file = fopen(FILE_NAME, "r");
    if (file == NULL) {
        perror("Failed to open file");
        return 1;
    }

    // Create a child process
    pid = fork();
    
    if (pid < 0) {
        perror("fork failed");
        return 1;
    }

    if (pid == 0) {
        // Child process: reads from pipe
        close(pipe_fd[1]);  // Close write end of the pipe

        read(pipe_fd[0], buffer, sizeof(buffer));  // Read file content from pipe
        printf("Child process received file content: \n%s\n", buffer);

        close(pipe_fd[0]);  // Close read end of the pipe
    } else {
        // Parent process: reads from file and writes to pipe
        close(pipe_fd[0]);  // Close read end of the pipe

        fread(buffer, sizeof(char), sizeof(buffer) - 1, file);  // Read file content
        buffer[strlen(buffer)] = '\0';  // Null-terminate the string

        write(pipe_fd[1], buffer, strlen(buffer) + 1);  // Write file content to pipe
        printf("Parent process sent file content to child.\n");

        fclose(file);
        close(pipe_fd[1]);  // Close write end of the pipe
    }

    return 0;
}
