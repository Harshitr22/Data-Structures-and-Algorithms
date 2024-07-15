#include <iostream>
using namespace std;

// Print all the number from N upto 1

void print(int n) {
    if( n < 1) return;
    cout<<n<<" ";
    print(n-1);
}

int main() {
    int t;
    cout<<"Enter the number: ";
    cin>>t;
    print(t);
    return 0;
}
