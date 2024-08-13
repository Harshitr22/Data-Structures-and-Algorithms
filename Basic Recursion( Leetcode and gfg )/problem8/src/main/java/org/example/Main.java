package org.example;
import java.util.*;

// Checks if the given number is the part of the fibonacci series

public class Main{
    public static void main(String[] args){
//        Getting inout from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int numb = scan.nextInt();

        if(isfibo(numb)){
            System.out.println("The number is a part of fibonacci series.");
        }else{
            System.out.println("The number is not a part of fibonacci series.");
        }
    }

    public static boolean isfibo(int n){
        if(n == 1 || n ==0){
            return true;
        }
        int last = 1, secondLast =0;
        while(true){
            int curr = secondLast + last;
            if(curr == n){
                return true;
            }
            if(curr > n){
                return false;
            }
            secondLast = last;
            last = curr;
        }
    }
}