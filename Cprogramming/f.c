#include<stdio.h>
int main() {
    int *p = NULL;                        // Step 1: Declare a NULL pointer `p`
    p = (int *)malloc(sizeof(int));       // Step 2: Allocate memory dynamically for an `int`
    *p = 10;                              // Step 3: Assign the value `10` to the memory pointed by `p`
    free(p);                              // Step 4: Free the allocated memory for `p`

    int *q;                               // Step 5: Declare another pointer `q`
    q = (int *)malloc(sizeof(int));       // Step 6: Allocate memory dynamically for an `int`
    *q = 15;                              // Step 7: Assign the value `15` to the memory pointed by `q`

    printf("%d %d\n", *p, *q);            // Step 8: Print the values pointed by `p` and `q`

    return 0;                             // End of program
}
