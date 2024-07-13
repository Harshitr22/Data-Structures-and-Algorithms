package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = allDivisors(12);
        for (int e : numbs) {
            System.out.println(e);
        }
    }
//<---------- Brute Force Approach ---------->
//    public static ArrayList<Integer> allDivisors(int n) {
//        ArrayList<Integer> elements = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                elements.add(i);
//            }
//        }
//        return elements;
//    }


    //<---------- Optimal Force Approach ---------->
    public static ArrayList<Integer> allDivisors( int n)
    {
        ArrayList<Integer> elems = new ArrayList<>();
        for(int i=1; i*i <=n ; i++ ) {
            if( n%i == 0){
                elems.add(i);
            }
            if( n/i != i )
            {
                elems.add(n/i);
            }
        }
        return elems;
    }
}