package org.example;
import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check if it’ s a prime number: ");
        int numb = scan.nextInt();
        if( isPrime( numb)) {
            System.out.println("The number "  + numb + " is a prime number.");
        }else{
            System.out.println("The number "  + numb + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        boolean isPrime = false;
        ArrayList<Integer> elems = new ArrayList<>();
        for( int i=1; i<=n; i++){
            if( n%i == 0){
                elems.add(i);
            }
        }
        if( elems.size() == 2) {
            isPrime = true;
        }
        return isPrime;
    }
}
