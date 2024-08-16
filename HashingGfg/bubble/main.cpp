#include <iostream>
#include<vector>
using namespace std;


// Bubble Sort

vector<int> bubbleSort(vector<int> arr, int n) {
    for(int i=n-1; i>=0; i--){
        for(int j=0; j<=i-1; j++){
            if((arr[j]> arr[j+1])){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return arr;
}


int main() {
    int n;
    cout<<"Enter the number of elements you want in an array:"<<endl;
    cin>>n;
    cout<<"Enter the elements: ";
    vector<int> arr(n);
    for(int i = 0; i < n; i++){
        cin>>arr[i];
    }

    // Before Sorting
    cout<<"Before Bubble Sort algorithm is applied: ";
    for(int i=0; i<arr.size(); i++){
        if(i == 0){
            cout<<"{ ";
        }
        cout<<arr[i]<<" ";
    }
    cout<<"}"<<endl;;

    // getting results of bubble sort
    vector<int> array = bubbleSort(arr, arr.size());

    // Displaying the result of bubble sort
    cout<<"The sorted array is: ";
    cout<<"{ ";
    for(int i=0; i<array.size(); i++){
        cout<<array[i]<< " ";
    }
    cout<<"}"<<endl;
}
