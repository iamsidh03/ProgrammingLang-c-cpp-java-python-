#include<iostream>
using namespace std;

// Print subarrays from st to end
void subarray(string& s, int st, int end) {
    if (end >= s.length()) return;

    for (int i = st; i <= end; i++) {
        cout << s[i] << " ";
    }
    cout << endl;

    subarray(s, st, end + 1);
}

// Loop through all starting indices
void allsubarray(string& s, int st, int end) {
    for (int i = 0; i <= s.length() - 1; i++) {
        subarray(s, i, i);  // correct now
    } 
}

int main() {
    string s;
    cin >> s; // input: abc

    int st = 0;
    int end = 0;

    allsubarray(s, st, end);

    return 0;
}
