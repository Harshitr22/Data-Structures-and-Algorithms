#include <iostream>
using namespace std;

class Solution{
public:
    int evenlyDivides(int N){
        int og = N;
        int count = 0;
        while( N > 0){
            int ld = N%10;
            if(ld!=0 && og%ld == 0){
                count++;
            }
            N = N/10;
        }
        return count;
    }
};

int main() {
    int N;
    cin>>N;
    Solution ob;
    cout << ob.evenlyDivides(N) << endl;
    return 0;
}
