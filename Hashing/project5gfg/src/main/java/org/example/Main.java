package org.example;

import java.util.Arrays;

//Frequencies of Limited Range Array Elements - gfg

public class Main {
    public static void main(String[] args) {
        int[] elems = {1, 2, 1, 2, 5};
//        count(elems, 5, 5);

        int[] arr = findFrequency("abcdg");
        for(int i : arr) {
            System.out.print(i);
        }

    }

    public static int[] findFrequency(String S) {
        // Write your code here.
        int[] arr = new int[26];
        for(int i=0; i<S.length()-1; i++){
            arr[S.charAt(i)-'a']++;
        }
        return arr;
    }

    public static void count(int[] arr, int n, int p) {
        int[] elems = new int[n+1];
        if(findMaxDigit(arr) > p) {
            Arrays.fill(arr, 0);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                elems[arr[i]]++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = elems[i+1];
        }
        for(int i:arr){
            System.out.print(i);
        }
    }

    public static int findMaxDigit(int[] arr) {
        int maxDigit = 0;
        for (int num : arr) {
            while (num > 0) {
                int digit = num % 10;
                maxDigit = Math.max(maxDigit, digit);
                num /= 10;
            }
        }
        return maxDigit;
    }
}