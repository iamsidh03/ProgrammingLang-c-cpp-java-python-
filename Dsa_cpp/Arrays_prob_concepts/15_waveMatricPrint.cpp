#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<vector<int>> arr{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}        
    };
    // O/P:1 4 7 8 5 2 3 6 9 
    
    int n = arr.size();   // Number of rows
    int m = arr[0].size(); // Number of columns

    for (int i = 0; i < m; i++) {
        if ((i & 1) == 0) { // Even index column → Top to Bottom
            for (int j = 0; j < n; j++) {
                cout << arr[j][i] << " ";
            }
        } else { // Odd index column → Bottom to Top
            for (int j = n - 1; j >= 0; j--) {
                cout << arr[j][i] << " ";
            }
        }
    }

    return 0;
}
