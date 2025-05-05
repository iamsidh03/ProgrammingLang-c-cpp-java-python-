#include <stdio.h>

void findUnique(int arr[], int size) {
    printf("Unique elements are: ");
    for (int i = 0; i < size; i++) {
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
        }
        if (count == 1) {
            printf("%d ", arr[i]);
        }
    }
    printf("\n");
}

int main() {
    int arr[] = {4, 5, 6, 4, 7, 8, 8};
    int size = sizeof(arr) / sizeof(arr[0]);
    
    findUnique(arr, size);
    return 0;
}
