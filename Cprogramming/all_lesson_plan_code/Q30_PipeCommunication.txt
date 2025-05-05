#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main() {
    int pipe_fd[2];  // File descriptors for the pipe
    pid_t pid;
    char write_msg[] = "Hello from parent process!";
    char read_msg[100];

    // Create a pipe
    if (pipe(pipe_fd) == -1) {
        perror("pipe failed");
        return 1;
    }

    // Create a child process
    pid = fork();
    
    if (pid < 0) {
        // Error in fork
        perror("fork failed");
        return 1;
    }

    if (pid == 0) {
        // Child process: reads from pipe
        close(pipe_fd[1]);  // Close write end of the pipe
        
        read(pipe_fd[0], read_msg, sizeof(read_msg));  // Read message from pipe
        printf("Child process received message: %s\n", read_msg);
        
        close(pipe_fd[0]);  // Close read end of the pipe
    } else {
        // Parent process: writes to pipe
        close(pipe_fd[0]);  // Close read end of the pipe
        
        write(pipe_fd[1], write_msg, strlen(write_msg) + 1);  // Write message to pipe
        printf("Parent process sent message: %s\n", write_msg);
        
        close(pipe_fd[1]);  // Close write end of the pipe
    }

    return 0;
}
