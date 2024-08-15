#include <iostream>
using namespace std;
#include <vector>

int  select(vector<int> arr, int i)
{
    // code here such that selectionSort() sorts arr[]
    int mini = i;
    for(int j=i+1; j<arr.size(); j++){
        if(arr[j] < arr[mini]){
            mini=j;
        }
    }
    return mini;
}

void selectionSort(vector<int> arr, int n)
{
    //code here
    for(int i=0; i<n; i++){
        int mini = select(arr, i);
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }

    cout<<"{ ";
    for(int i: arr) {
        cout<<i<<" ";
    }
    cout<<"}";

}

int main() {
    int n;
    cout<<"Enter the number of elements: ";
    cin>>n;
    cout<<"Enter the element:";
    vector<int> arr(n);
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }
    selectionSort(arr, arr.size());

}

