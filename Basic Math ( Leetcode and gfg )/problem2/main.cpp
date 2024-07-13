#include <iostream>
#include <limits>
#include <cstdint>

using namespace std;

class Solution {
public:
    int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int ld = x % 10;

            // Check for overflow before it happens
            if (reversed > (numeric_limits<int>::max() / 10) ||
                reversed < (numeric_limits<int>::min() / 10)) {
                return 0;  // Indicate overflow
                }

            reversed = (reversed * 10) + ld;
            x = x / 10;
        }
        return reversed;
    }
};

int main() {
    int t;
    cin>>t;
    Solution ab;
    cout<<ab.reverse(t);
    return 0;
}