package org.example;

// Print the fibonacci series upto number N
//Print nth number of fibonacci series
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> arr = fibonacci(5);
	for(int e: arr) {
            System.out.print( e + " " );
        }

//        System.out.println(fibonacci(4));

    }

//    For printing nth fibonacci number
//    public static int fibonacci(int n){
//        if(n <= 1) return n;
//        return fibonacci(n-1) + fibonacci(n-2);
//    }

//    for printing fibonacci number until n
public static ArrayList<Integer> fibonacci(int n){
    ArrayList<Integer> elems = new ArrayList<>();
    if( n==0 ) return elems;
    else {
        int f0 = 0;
        int f1=1;
        elems.add(f0);
        elems.add(f1);
        int curr = 0;
        for(int i=2; i<=n; i++){
            curr = f0 + f1;
            f0 = f1;
            f1 = curr;
            elems.add(curr);
        }
        return elems;
    }
}

}
