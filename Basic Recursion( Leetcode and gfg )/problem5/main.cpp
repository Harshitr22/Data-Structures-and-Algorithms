#include <iostream>
#include<vector>
using namespace std;

//Find all factorial numbers less than or equal to n

vector<long long> factorialNumbers(long long n) {
    // Write Your Code here
    vector<long long> elems;
    int factorial = 1;
    int i=1;
    while(factorial <= n ){
        elems.push_back(factorial);
        i++;
        factorial = factorial * i;
    }
    return elems;
}

int main() {
    int t;
    cout<<"Enter the number: ";
    cin>>t;
    for(int e: factorialNumbers(t)) {
        cout<<e<<endl;
    }
    return 0;
}

