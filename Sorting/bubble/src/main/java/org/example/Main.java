package org.example;

// Bubble Sort

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in an array: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        // Before Sorting
        System.out.println("Before Bubble Sort algorithm is applied: ");
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                System.out.print("{ ");
            }
            System.out.print(arr[i] + " ");
        }
        System.out.print("}");
        System.out.println();
        System.out.println("--------------------");

        // getting results of bubble sort
        int[] array = bubbleSort(arr, arr.length);

        // Displaying the result of bubble sort
        System.out.println("The sorted array is: ");
        for(int i=0; i<array.length; i++){
            if(i == 0){
                System.out.print("{ ");
            }
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
    }

    // Bubble Sort algorithm implementation
    public static int[] bubbleSort(int[] arr, int n){
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
}