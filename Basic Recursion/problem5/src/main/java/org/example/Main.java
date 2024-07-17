package org.example;

// Check if the given string is palindrome or not

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word to check if it's a palindrome: ");
        String word = scan.nextLine();
        if(isPalindrome(word)){
            System.out.println( word + " is a palindrome");
        }else {
            System.out.println( word + " is not a palindrome");
        }
//        String word = "noss";
//        System.out.println(word.length());
    }


    public static boolean isPalindrome(String word){
        int start = 0;
        int last = word.length()-1;
        while(start < last){
            if(word.charAt(start) != word.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}