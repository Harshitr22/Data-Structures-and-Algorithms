package org.example;

public class Main {
    public static void main(String[] args){
        int number = 12345;
        int reverse = reverseInt(number);
        System.out.println("Reversed number is:" + reverse);

    }

    public static int reverseInt(int n){
        int revNumb = 0;
        while ( n > 0 ){
            int modNumb = n%10;
            revNumb = ( revNumb * 10) + modNumb;
            n = n/10;
        }
        return revNumb;
    }
}

