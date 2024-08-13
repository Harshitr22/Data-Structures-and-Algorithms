package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Count frequencies of each element in the array
public class Main{
    public static void main(String[] args){

//        Using hashmaps: Optimal Way
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the number of elements you want to add: ");
//        int n = scan.nextInt();
//        System.out.println("Enter the elements you want to add: ");
//        int[] arr = new int[n];
//       for(int i = 0; i < n; i++){
//            arr[i] = scan.nextInt();
//        }
//
////       Showing the answer
//        HashMap<Integer, Integer> map = Freq(arr);
//        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
//            int key = entry.getKey();
//            int value = entry.getValue();
//            System.out.println(key + ": " + value);
//        }


//        ---------------------------------------------------------------------

//        Alternate Way : Not so optimal way but still good
        int[] arr = {1, 2, 1, 2, 3, 1, 8};
        countFreq(arr, arr.length);
    }


//    Alternate Way
    public static void countFreq(int[] arr, int n){
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " appeared " + count + " times.");
        }
    }

//    Hashmaps : counting frequencies
//    public static HashMap<Integer, Integer> Freq(int[] arr){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            int key = arr[i];
//            if(map.containsKey(key)) {
//                map.put(key, map.get(key) + 1);
//            }
//            else {
//                map.put(key, 1);
//            }
//        }
//        return map;
//    }


}