#include <iostream>
using namespace std;

class Solution{
public:
    //Complete this function
    void printNos(int N, int i=1)
    {
        if(i>N) return;
        cout<<i<<" " ;
        return printNos(N, i+1);
    }
};

int main() {
    int t;
    cout<<"ENter the number: ";
    cin>>t;
    Solution ab;
    ab.printNos(t);
    return 0;
}