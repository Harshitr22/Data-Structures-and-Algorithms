package org.example;
import java.util.*;

// Selection Sort

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter the number of elements you want in an array: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        // Selection sort
        int[] array = selectionSort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0; i<array.length; i++){
            if(i == 0){
                System.out.print("{ ");
            }
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
    }

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int mini = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        return arr;
    }
}