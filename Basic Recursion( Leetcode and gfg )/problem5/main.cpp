#include <iostream>
#include<vector>
using namespace std;

//Find all factorial numbers less than or equal to n

// vector<long long> factorialNumbers(long long n) {
//     // Write Your Code here
//     vector<long long> elems;
//     int factorial = 1;
//     int i=1;
//     while(factorial <= n ){
//         elems.push_back(factorial);
//         i++;
//         factorial = factorial * i;
//     }
//     return elems;
// }

// Finding the solution recursively
vector<int> factorialNumbers(int n, int og) {
    if(n==1) return {1};

    vector<int> elems = factorialNumbers(n-1, og);
    int currElem = n*elems.back();
    if(currElem <= og) elems.push_back(currElem);

    return elems;
}

vector<int> factorialNumbers(int n) {
    return factorialNumbers(n, n);
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

