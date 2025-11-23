// #include <stdlib.h>
// #include <stdio.h>
// #include <unistd.h>
// #include <pthread.h>

// int x = 2;

// void* routine() {  
//     x += 5;
//     sleep(2);
//     printf("Value of x: %d\n", x);
// }

// void* routine2() {
//     sleep(2);
//     printf("Value of x: %d\n", x);
// }

// int main(int argc, char* argv[]) {
//     pthread_t t1, t2;
//     if (pthread_create(&t1, NULL, &routine, NULL)) {
//         return 1;
//     }
//     if (pthread_create(&t2, NULL, &routine2, NULL)) {
//         return 2;
//     }
//     if (pthread_join(t1, NULL)) {
//         return 3;
//     }
//     if (pthread_join(t2, NULL)) {
//         return 3;
//     }
//     return 0;
// }

// //thread share the same memory and system resources
// // ie why the value of x also increment in routine2 also


#include <stdio.h>
#include <pthread.h>
#include <unistd.h>  // For sleep function

void *print_message(void *arg) {
    printf("Thread: Hello from the new thread!\n");
    sleep(2); // Simulate some work
    printf("Thread: Work done!\n");
    return NULL;
}

int main() {
    pthread_t thread;

    // Create a thread
    pthread_create(&thread, NULL, print_message, NULL);

    // Wait for the thread to finish
    pthread_join(thread, NULL);

    printf("Main: The thread has finished. Now continuing...\n");
    return 0;
}
