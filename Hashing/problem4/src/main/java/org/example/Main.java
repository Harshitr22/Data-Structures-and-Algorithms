package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Count frequencies of each element in the array
public class Main{
    public static void main(String[] args){

//        Using hashmaps
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements you want to add: ");
        int[] arr = new int[n];
       for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }


//       Showing the answer
        HashMap<Integer, Integer> map = Freq(arr);
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }


    }

//    Hashmaps : counting frequencies
    public static HashMap<Integer, Integer> Freq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            else {
                map.put(key, 1);
            }
        }
        return map;
    }
}