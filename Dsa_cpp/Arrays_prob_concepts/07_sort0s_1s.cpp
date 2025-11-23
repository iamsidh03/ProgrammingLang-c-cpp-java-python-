#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> arr{1,1,0,1,1,1,0,1,0,0,0,0,1};
    int start = 0, end = arr.size() - 1;
    int i = 0;

    while (i <= end) {
        if (arr[i] == 0) {
            // swap(arr[start], arr[i]);
            // start++;
            i++; // Move forward
        } 
        else {
            swap(arr[end], arr[i]);
            end--;
            // Don't increment i because the swapped value from end might be 0
        }
    }

    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
