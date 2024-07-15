#include <iostream>
using namespace std;

// Printing the name for N number of time

void print(int n, string name, int i=1) {
    if (i > n) return;
    cout<<name<<endl;
    print(n,name, i+1);
}

int main() {
    int t;
    string name;
    cout<<"Enter the number of your choice: ";
    cin>>t;
    cout<<"Enter your name: ";
    cin>>name;
    print(t, name);
    return 0;
}
