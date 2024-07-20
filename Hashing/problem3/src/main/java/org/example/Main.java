package org.example;
import java.util.*;

// How to hash large numbers like 10^9 or higher:
// Hashmap for numbers

public class Main{
    public static void main(String[] args){
//        hashmaps for hashing numbers

//        Getting the inputs from the user
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in array: ");
        int n = scan.nextInt();

        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        HashMap<Integer, Integer> map = find(arr);
        System.out.print("Enter the number of element's whose count you want to know: ");
        int q = scan.nextInt();

        System.out.println("Enter the number of which you want to know the count: ");

        while(q-- != 0){
            int number;
            number = scan.nextInt();
            System.out.println("The number(" + number + ") appeared for " + map.get(number) + " times") ;
        }
    }

//    Function using hashmap for numbers:
    public static HashMap<Integer, Integer> find(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int freq = 0;
            if(map.containsKey(key)) freq = map.get(key);
            freq++;
            map.put(key, freq);
        }
        return map;
    }
}