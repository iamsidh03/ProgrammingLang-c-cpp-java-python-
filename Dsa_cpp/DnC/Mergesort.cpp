#include<iostream>
using namespace std;

void merge(int arr[], int s, int e) {
    int mid = (s + e) / 2;
    int lenLeft = mid - s + 1;
    int lenRight = e - mid;
    int *left = new int[lenLeft];
    int *right = new int[lenRight];

    // Copying elements to left array
    int k = s;
    // k --> starting index of left array values in original array
    for (int i = 0; i < lenLeft; i++) {
        left[i] = arr[k];
        k++;
    }

    // Copying elements to right array
    k = mid + 1;
    for (int i = 0; i < lenRight; i++) {
        right[i] = arr[k++];
    }

    // Actual merge logic
    // Left array is already sorted
    // Right array is already sorted
    int leftIndex = 0;
    int rightIndex = 0;
    int mainArrayIndex = s;

    while (leftIndex < lenLeft && rightIndex < lenRight) {
        if (left[leftIndex] < right[rightIndex]) {
            arr[mainArrayIndex] = left[leftIndex];
            leftIndex++;
        } else {
            arr[mainArrayIndex] = right[rightIndex];
            rightIndex++;
        }
        mainArrayIndex++; // ✅ Fixed placement of mainArrayIndex++
    }

    // Case 1: left array has remaining elements
    while (leftIndex < lenLeft) {
        arr[mainArrayIndex] = left[leftIndex];
        leftIndex++;
        mainArrayIndex++;
    }

    // Case 2: right array has remaining elements
    while (rightIndex < lenRight) {
        arr[mainArrayIndex] = right[rightIndex];
        rightIndex++;
        mainArrayIndex++;
    }

    // Delete the dynamically allocated memory
    delete[] left;
    delete[] right;
    // Left and right arrays are no longer needed
}

void mergeSort(int arr[], int s, int e) {
    if (s > e) return;
    if (s == e) return;
    else {
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e);
    }
}

int main() {
    int arr[] = {2, 1, 6, 9, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    int s = 0;
    int e = size - 1;

    cout << "Before sorting array is: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    cout << "after Sorted array is: ";
    mergeSort(arr, s, e);
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
