package org.example;
import java.util.*;

// Print the sum of all numbers upto N from 1

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int choice = scan.nextInt();
        System.out.println(print(choice));
    }

    public static int print(int n){
        if(n==0) return 0;
        return n + print(n-1);
    }
}