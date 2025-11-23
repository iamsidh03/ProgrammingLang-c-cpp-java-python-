#include <stdio.h>
#include <pthread.h>

// Function to perform individual tasks
void *performTask(void *arg) {
    int taskNumber = *((int *)arg);
    printf("Task %d is being performed by a thread.\n", taskNumber);
    return NULL;
}

int main() {
    pthread_t threads[5];
    int taskNumbers[5];

    // Create 5 threads to perform different tasks
    for (int i = 0; i < 5; i++) {
        taskNumbers[i] = i + 1;  // Assign task numbers
        if (pthread_create(&threads[i], NULL, performTask, (void *)&taskNumbers[i]) != 0) {
            printf("Error creating thread\n");
            return 1;
        }
    }

    // Wait for all threads to complete their tasks
    for (int i = 0; i < 5; i++) {
        pthread_join(threads[i], NULL);
    }

    printf("All tasks are completed by multiple threads.\n");
    return 0;
}
