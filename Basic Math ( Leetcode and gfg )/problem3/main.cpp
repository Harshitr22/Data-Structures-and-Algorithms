#include<iostream>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

};

int main() {
    int t;
    cin>>t;
    Solution ab;
    if(ab.isPalindrome(t)) {
        cout<<"It is an Palindrome"<<endl;;
    }else {
        cout<<"It is not a palindrome"<<endl;
    }
    return 0;
}