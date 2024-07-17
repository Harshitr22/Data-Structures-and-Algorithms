package org.example;
import java.util.*;

// Find the reverse of an array

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

//        Normal approach
        ArrayList<Integer> reverse = reverse(array);
       for(int i : array){
            System.out.print(i + " ");
       }

//       for Recursion approach
//       reverse(array, 0, 4);
//       for(int i : array){
//            System.out.print(i + " ");
//       }
    }


    public static ArrayList<Integer> reverse(ArrayList<Integer> array){
        ArrayList<Integer> arr = array;
        int start = 0;
        int last = arr.size() - 1;
        while(start < last){
            int temp = arr.get(start);
            arr.set(start, arr.get(last));
            arr.set(last, temp);
            last--;
            start++;
        }
        return arr;
    }


//    Same algorithm but this time using recursion
//    public static void reverse(ArrayList<Integer> array, int start, int last){
//        while(start < last){
//            int temp = array.get(start);
//            array.set(start, array.get(last));
//            array.set(last, temp);
//            reverse(array, start+1, last-1);
//        }
//    }



}