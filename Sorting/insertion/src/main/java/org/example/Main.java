package org.example;

// Insertion Sort Algorithm

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
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
        int[] array = insertionSort(arr);

        // Displaying the result of bubble sort
        System.out.println("The sorted array is: ");
        System.out.print("{ ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
    }

    public static int[] insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}