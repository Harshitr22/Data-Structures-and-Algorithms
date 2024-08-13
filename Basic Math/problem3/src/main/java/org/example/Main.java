package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number to check if it's a palindrome: ");
        int number = scan.nextInt();
        int reversed = reverseInt(number );
        if ( number == reversed){
            System.out.println("It is an palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }

    public static int reverseInt(int n){
        int revNumb =0;
        while ( n > 0 ){
            int modNumb = n%10;
            revNumb = ( revNumb * 10) +modNumb;
            n = n/10;
        }
        return revNumb;
    }
}
