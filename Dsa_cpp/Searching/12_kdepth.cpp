#include <iostream>
#include <set>
#include <algorithm> // for sort
using namespace std;

// ✅ Brute Force Approach - O(n^2)
int a1(int arr[], int n, int k) {
    set<pair<int, int>> st;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (abs(arr[i] - arr[j]) == k) {
                st.insert({min(arr[i], arr[j]), max(arr[i], arr[j])});
            }
        }
    }
    return st.size();
}

// ✅ Binary Search Function
int bs(int arr[], int n, int start, int target) {
    int low = start;
    int high = n - 1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }

    return -1;
}

// ✅ Optimized Approach using Binary Search - O(n log n)
int a2(int arr[], int n, int k) {
    sort(arr, arr + n); // use C-style sort for arrays

    set<pair<int, int>> st;

    for (int i = 0; i < n; i++) {
        if (bs(arr, n, i + 1, arr[i] + k) != -1) {
            st.insert({arr[i], arr[i] + k});
        }
    }

    return st.size();
}

int main() {
    int arr[] = {3, 1, 4, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k = 2;

    cout << "Brute Force Result: " << a1(arr, n, k) << endl;
    cout << "Optimized (Binary Search) Result: " << a2(arr, n, k) << endl;

    return 0;
}
