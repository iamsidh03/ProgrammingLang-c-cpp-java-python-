#include <stdio.h>

int findLargest(int *arr, int size) {
    int *max = arr;

    for (int i = 1; i < size; i++) {
        if (*(arr + i) > *max) {
            max = arr + i; // Point to the new largest value
        }
    }

    return *max; // Dereference to get the largest value
}

int main() {
    int arr[] = {34, 56, 23, 89, 12, 45};
    int size = sizeof(arr) / sizeof(arr[0]);

    int largest = findLargest(arr, size);

    printf("The largest value in the array is: %d\n", largest);
    return 0;
}
