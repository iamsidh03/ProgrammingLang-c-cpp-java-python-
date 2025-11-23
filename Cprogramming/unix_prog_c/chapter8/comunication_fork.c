//this program will not works on windows

#include <stdio.h>
#include <unistd.h>
#include <string.h>

int main() {
    int fd[2];  // Array to hold pipe descriptors
    char write_msg[] = "Message from parent!";
    char read_msg[100];

    // Create a pipe
    if (pipe(fd) == -1) {
        perror("Pipe failed");
        return 1;
    }

    pid_t pid = fork();  // Create a child process

    if (pid > 0) {  // Parent process
        close(fd[0]);  // Close unused read end
        write(fd[1], write_msg, strlen(write_msg) + 1);  // Write message
        close(fd[1]);  // Close write end
    } else if (pid == 0) {  // Child process
        close(fd[1]);  // Close unused write end
        read(fd[0], read_msg, sizeof(read_msg));  // Read message
        printf("Child received: %s\n", read_msg);
        close(fd[0]);  // Close read end
    } else {
        perror("Fork failed");
        return 1;
    }

    return 0;
}
