#include <iostream>
#include <iomanip> // Required for setting precision
using namespace std;

int sqrt(int n) {
    int s = 0, e = n;
    int ans = 0; // To store the best possible square root
    while (s <= e) {
        long long mid = s + (e - s) / 2;
        long long sq = mid * mid; // Use long long to prevent overflow

        if (sq == n) return mid;  // Perfect square case
        else if (sq < n) {
            ans = mid; // Store potential answer
            s = mid + 1;
        } else {
            e = mid - 1;
        }
    }
    return ans; // Return the integer square root
}

int main() {
    int n = 10;
    int ans = sqrt(n);
    int precision = 11; // Number of decimal places
    double step = 0.1;
    double finalans = ans;

    for (int i = 0; i < precision; i++) {
        for (double j = finalans; j * j <= n; j += step) {
            finalans = j;
        }
        step /= 10;
    }

    // Print final answer with 11 decimal places
    cout << fixed << setprecision(11) << finalans << endl;
    return 0;
}
