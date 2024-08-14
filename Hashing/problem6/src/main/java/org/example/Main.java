package org.example;

// Find the highest/lowest frequency element

import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        int[] arr = {1,2,2,2,3,4,1,2,9};
        find(arr);
    }

    public static void find(int[] arr){
        int highest=0, least = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }

//        Traversing and finding
        int maxEle=0, minEle=0, maxFreq=0, minFreq=arr.length;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxFreq){
                maxEle = element;
                maxFreq = count;
            }
            if(count < minFreq){
                minEle = element;
                minFreq = count;
            }
        }
        System.out.println("Highest element: "+maxEle);
        System.out.println("Lowest element: "+minEle);
    }
}