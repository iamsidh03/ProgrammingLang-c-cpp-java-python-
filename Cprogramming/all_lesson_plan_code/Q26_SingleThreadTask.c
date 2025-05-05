#include <stdio.h>
#include <pthread.h>

// Function that performs a task
void *performTask(void *arg) {
    printf("Task is being performed by a single thread.\n");
    return NULL;
}

int main() {
    pthread_t thread;

    // Create a single thread to perform a task
    if (pthread_create(&thread, NULL, performTask, NULL) != 0) {
        printf("Error creating thread\n");
        return 1;
    }

    // Wait for the thread to finish
    pthread_join(thread, NULL);

    printf("Task completed by the single thread.\n");
    return 0;
}
