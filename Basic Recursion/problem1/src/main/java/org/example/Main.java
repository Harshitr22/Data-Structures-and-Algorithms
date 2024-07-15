package org.example;

// Print Name N times using Recursion

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nTime = 5;
        print(1,nTime);
    }

    public static void print(int i, int n) {
        if(i > n) return;
        System.out.println("Harshit");
        print(i+1, n);
    }

}