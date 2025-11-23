#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();  // Create a new process

    if (pid < 0) {
        // Error occurred
        perror("fork failed");
        return 1;
    }
    else if (pid == 0) {
        // Child process
        printf("This is the child process. PID: %d\n", getpid());
        // You can perform some task specific to the child process here
    }
    else {
        // Parent process
        printf("This is the parent process. PID: %d\n", getpid());
        printf("Child process PID: %d\n", pid);
        // You can perform some task specific to the parent process here
    }

    return 0;
}
