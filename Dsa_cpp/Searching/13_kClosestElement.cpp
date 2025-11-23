#include<iostream>
#include<vector>
#include<cmath>
#include<climits>
#include<algorithm>
using namespace std;

//https://leetcode.com/problems/find-k-closest-elements/

//Approach 1: sort according to difference 
int a1(int arr[], int n, int k, int x) {
    
}

vector<int> findClosestElements(int arr[], int n, int k, int x) {
    int idx = -1;

    // Step 1: Find the closest index to x
    for (int i = 0; i < n; i++) {
        if (arr[i] >= x) {
            if (i > 0 && abs(arr[i - 1] - x) <= abs(arr[i] - x)) {
                idx = i - 1;
            } else {
                idx = i;
            }
            break;
        }
    }

    if (idx == -1) idx = n - 1; // All elements < x

    // Step 2: Two pointers
    int i = idx - 1;
    int j = idx;
    vector<int> res;

    while (k--) {
        if (i < 0) {
            res.push_back(arr[j++]);
        } else if (j >= n) {
            res.push_back(arr[i--]);
        } else {
            if (abs(arr[i] - x) <= abs(arr[j] - x)) {
                res.push_back(arr[i--]);
            } else {
                res.push_back(arr[j++]);
            }
        }
    }

    // Step 3: Sort result because we might have added from left side
    sort(res.begin(), res.end());
    return res;
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int k = 4;
    int x = 3;
    int n = sizeof(arr) / sizeof(arr[0]);

    vector<int> result = findClosestElements(arr, n, k, x);

    cout << "Output: ";
    for (int val : result) {
        cout << val << " ";
    }

    return 0;
}