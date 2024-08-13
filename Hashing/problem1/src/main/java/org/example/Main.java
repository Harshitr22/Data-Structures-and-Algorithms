package org.example;
import java.util.*;

// Number hashing

public class Main{
    public static void main(String[] args) {

//        Brute force approach
//        int[] arr = {1,2,1,3,2};
//        int numb = 3;
//        System.out.println("The number(" + numb + ") appeared in array for: " + find(arr, numb) + " times");


//        Optimized approach using Hashing
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the number of elements you are going to type in: ");
//        int n = scan.nextInt();
//
//        System.out.println("Enter the element of the array: ");
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = scan.nextInt();
//        }
//
//        // pre-storing
//        int[] hash = new int[13];
//        for(int i=0; i<n; i++){
//            hash[arr[i]] += 1;
//        }
//
//        System.out.print("Enter the number of element's whose count you want to know: ");
//        int q = scan.nextInt();
//
//        System.out.println("Enter the number of which you want to know the count: ");
//
//        while(q-- != 0){
//            int number;
//            number = scan.nextInt();
//
//            System.out.println("The number(" + number + ") appeared for " + hash[number] + " times") ;
//        }
//
//    }

//    BRute force approach
//    public static int find(int[] elems, int numb){
//        int count = 0;
//        for(int i=0; i<elems.length; i++){
//            if(elems[i] == numb){
//                count++;
//            }
//        }
//        return count;
//    }

       boolean ans = reverse("harshit");
       if(ans)
       {
           System.out.println("True");
       }
       else
       {
           System.out.println("False");
       }

    }


//   public static boolean isPalin(String s){
//
//   }

   public static boolean reverse(String s) {

        for(int i = 0; i < s.length(); i++){
            
        }
   }




}