#include <iostream>

using namespace std;

//Sum of first n terms
// examples:
// Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

int sum(int n) {
    if(n==0) return 0;
    return n*n*n + sum(n-1);
}

int main() {
    int t;
    cout<<"Enter the number: ";
    cin>>t;
    cout<<sum(t)<<endl;
    return 0;
}
