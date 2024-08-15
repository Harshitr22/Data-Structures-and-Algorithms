#include <iostream>
using namespace std;

bool checkMember(int n){
    if(n == 1 || n ==0){
        return true;
    }
    int last = 1, secondLast = 0;
    while(true){
        int curr = secondLast + last;
        if(curr == n){
            return true;
        }
        if(curr > n){
            return false;
        }
        secondLast = last;
        last = curr;
    }
}
int main()
{
    int numb;
    cout<<"Enter the number: "<<endl;
    cin>>numb;
    bool isfibo = checkMember(numb);
    if (isfibo) {
        cout<<"It's a part of fibonacci series.";
    }else {
        cout<<"It's not a part of fibonacci series.";
    }
}

