#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    vector<long long> lcmAndGcd(long long A , long long B)
    {
        // code here
        long long a = A;
        long long b = B;
        vector<long long> gcandlc;
        long long gcd;
        while(A>0 && B>0){
            if( A > B){
                A=A%B;
            }else{
                B=B%A;
            }
            if( A == 0){
                gcd = B;
            }
            else{
                gcd = A;
            }
        }
        long long lcm = (a*b)/gcd;
        gcandlc.push_back(lcm);
        gcandlc.push_back(gcd);
        return gcandlc;

    }
};

int main() {
    long long A,B;

    cin>>A>>B;

    Solution ob;
    vector<long long> ans = ob.lcmAndGcd(A,B);
    cout<<ans[0]<<" "<<ans[1]<<endl;
    return 0;
}
