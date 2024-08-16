#include <iostream>
using namespace std;
#include<vector>;

void printArray(vector<int> arr, int size)
{
    int i;
    printf("{ ");
    for (i=0; i < arr.size(); i++)
        printf("%d ", arr[i]);
    printf(" }");
    printf("\n");
}

//Function to sort the array using insertion sort algorithm.
vector<int> insertionSort(vector<int> arr, int n)
{
    //code here
    for(int j=0; j<n; j++){
        int i= j;
        while(i>0 && arr[i-1]>arr[i]){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
            i--;
        }
    }
    return arr;
}


// Main function to get users
int main() {
    int n;
    cout<<"Enter the number of elements you want in an array: ";
    cin>>n;
    cout<<"Enter the elements: ";
    vector<int> arr(n);
    for(int i = 0; i < n; i++){
        cin>>arr[i];
    }

    // Before Sorting
    cout<<"Before Bubble Sort algorithm is applied: ";
    printArray(arr, arr.size());

    // getting results of bubble sort
    vector<int> array = insertionSort(arr, arr.size());

    // Displaying the result of bubble sort
    cout<<"The sorted array is: ";
    printArray(array, array.size());
    return 0;
}
