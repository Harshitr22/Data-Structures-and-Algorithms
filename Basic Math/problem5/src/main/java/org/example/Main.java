package org.example;
import java.lang.Math;

public class Main {
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        while(n > 0){
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n = n / 10;
        }
        return sum == num ? true : false;
    }

    public static void main(String[] args) {
        int number = 371;
        if (isArmstrong(number)) {
            System.out.println("Yes, " + number + " is an Armstrong number");
        }
        else {
            System.out.println("No, " + number + " is not an Armstrong number");
        }
    }

}