#include <stdio.h>

void findMaxMin(int arr[], int size, int *max, int *min) {
    *max = arr[0];
    *min = arr[0];

    for (int i = 1; i < size; i++) {
        if (arr[i] > *max) {
            *max = arr[i];
        }
        if (arr[i] < *min) {
            *min = arr[i];
        }
    }
}

int main() {
    int arr[] = {23, 1, 56, 34, 90, 12, 78};
    int size = sizeof(arr) / sizeof(arr[0]);
    int max, min;

    findMaxMin(arr, size, &max, &min);

    printf("Maximum value: %d\n", max);
    printf("Minimum value: %d\n", min);

    return 0;
}
