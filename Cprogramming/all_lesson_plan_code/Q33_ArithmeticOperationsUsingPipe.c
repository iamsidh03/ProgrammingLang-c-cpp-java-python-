#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    int pipe_fd[2];  // File descriptors for the pipe
    pid_t pid;
    int num1 = 10, num2 = 5;
    int result;

    // Create a pipe
    if (pipe(pipe_fd) == -1) {
        perror("pipe failed");
        return 1;
    }

    // Create a child process
    pid = fork();

    if (pid < 0) {
        perror("fork failed");
        return 1;
    }

    if (pid == 0) {
        // Child process: reads from pipe and performs arithmetic
        close(pipe_fd[1]);  // Close write end of the pipe

        // Read numbers from the pipe
        read(pipe_fd[0], &num1, sizeof(num1));
        read(pipe_fd[0], &num2, sizeof(num2));

        // Perform arithmetic operations
        result = num1 + num2;
        printf("Child process: Sum = %d\n", result);
        result = num1 - num2;
        printf("Child process: Difference = %d\n", result);
        result = num1 * num2;
        printf("Child process: Product = %d\n", result);
        if (num2 != 0) {
            result = num1 / num2;
            printf("Child process: Division = %d\n", result);
        } else {
            printf("Child process: Division by zero error!\n");
        }

        close(pipe_fd[0]);  // Close read end of the pipe
    } else {
        // Parent process: writes numbers to pipe
        close(pipe_fd[0]);  // Close read end of the pipe

        // Write numbers to the pipe
        write(pipe_fd[1], &num1, sizeof(num1));
        write(pipe_fd[1], &num2, sizeof(num2));

        printf("Parent process sent numbers %d and %d to child for arithmetic operations.\n", num1, num2);

        close(pipe_fd[1]);  // Close write end of the pipe
    }

    return 0;
}
//gcc -o FileContentUsingPipe FileContentUsingPipe.c
//gcc -o ArithmeticOperationsUsingPipe ArithmeticOperationsUsingPipe.c
