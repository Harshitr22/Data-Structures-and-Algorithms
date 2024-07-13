#include <iostream>
using namespace std;

long long sumOfDivisors(int N)
{
    // Write Your Code here

    long long sum=0;
    for(int i=1; i<=N; ++i){

            sum += i*(N/i);
    }
    return sum;
}

int main() {
    int t;
    cin>>t;
    cout<<sumOfDivisors(t);
    return 0;
}
