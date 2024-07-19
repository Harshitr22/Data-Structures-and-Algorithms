package org.example;
import java.util.*;

// Character Hashing

public class Main{
    public static void main(String[] args){

//        Brute Force approach
//        String s = "Harshit";
//        char c = 'h';
//        System.out.println("The character (" + c + ") appeared " + f(s, c) + " times");

//        Optimized approach using hashing - Character Hashing
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = scan.nextLine();

        int[] arr = f(s);

        System.out.print("Enter the number of character's whose count is to be known: ");
        int n = scan.nextInt();

        System.out.println("Enter the characters: ");
        while( n-- >  0){
            char c = scan.next().charAt(0);
            // lower case letters
            //System.out.println(" The character(" + c + ") appeared " + arr[c - 'a'] + " times in " + s);

            // UPPER CASE LETTERS
            //System.out.println(" The character(" + c + ") appeared " + arr[c - 'A'] + " times in " + s);

            // UPPER CASE and lower case letters BOth
            System.out.println(" The character(" + c + ") appeared " + arr[c] + " times in " + s);
        }

    }


//    Brute force approach
    public static int f(String s, char c){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

//    Optimized approach using hashing
//    If the string contains only lowercase letters.
//    public static int[] f(String s){
//        int[] hash = new int[26];
//        for(int i=0; i<s.length(); i++){
//            hash[s.charAt(i) - 'a'] += 1;
//        }
//        return hash;
//    }

//    Optimized approach using hashing
//    If the string contains only uppercase letters.
//    public static int[] f(String s){
//        int[] hash = new int[26];
//        for(int i=0; i<s.length(); i++){
//            hash[s.charAt(i) - 'A'] += 1;
//        }
//        return hash;
//    }

//    Optimized approach using hashing
//    If the string contains both uppercase and lowercase letters.
    public static int[] f(String s){
        int[] hash = new int[256];
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)]++;
        }
        return hash;
    }


}