#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>

#define FIFO_NAME "/tmp/myfifo"  // Path to the FIFO

int main() {
    pid_t pid;
    char write_msg[] = "Hello from parent process using FIFO!";
    char read_msg[100];

    // Create the FIFO (named pipe)
    if (mkfifo(FIFO_NAME, 0666) == -1) {
        perror("mkfifo failed");
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
        // Child process: reads from FIFO
        int fifo_fd = open(FIFO_NAME, O_RDONLY);  // Open the FIFO for reading
        
        if (fifo_fd == -1) {
            perror("Failed to open FIFO for reading");
            return 1;
        }

        read(fifo_fd, read_msg, sizeof(read_msg));  // Read the message from the FIFO
        printf("Child process received message: %s\n", read_msg);

        close(fifo_fd);  // Close the FIFO
    } else {
        // Parent process: writes to FIFO
        int fifo_fd = open(FIFO_NAME, O_WRONLY);  // Open the FIFO for writing
        
        if (fifo_fd == -1) {
            perror("Failed to open FIFO for writing");
            return 1;
        }

        write(fifo_fd, write_msg, strlen(write_msg) + 1);  // Write the message to the FIFO
        printf("Parent process sent message: %s\n", write_msg);

        close(fifo_fd);  // Close the FIFO
    }

    // Remove the FIFO after communication is done
    unlink(FIFO_NAME);

    return 0;
}
//gcc -o FIFOCommunication FIFOCommunication.c
