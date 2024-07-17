#include <iostream>
#include <vector>
using namespace std;

// Reverse array in groups:
// void revGiven an array arr of positive integers. Reverse every sub-array group of size k.
// Note: If at any instance, k is greater or equal to the array size, then reverse the entire array.
// You shouldn't return any array, modify the given array in place.

void reverseInGroups(vector<long long int>& arr, int k) {
    int n = arr.size();
    if (k >= n) {
        int start = 0;
        int last = n - 1;
        while (start < last) {
            long long int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    } else {
        for (int i = 0; i < n; i += k) { // Change to i < n
            int start = i;
            int last = min(i + k - 1, n - 1);
            while (start < last) {
                long long int temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
                start++;
                last--;
            }
        }
    }
}

int main() {
    vector<long long int> arr = {1, 2, 3, 4, 5, 6, 7, 8};
    int k = 5;

    reverseInGroups(arr, k);

    for (long long int i : arr) {
        cout << i << " ";
    }
    cout << endl;

    return 0;
}