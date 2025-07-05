package com.java;

public class FibonacciExample {
    public static void main(String[] args) {
        int count = 10;
        int first = 0 , second = 1;
        System.out.println("Fibonacci series up to " + count + " terms " );
        for(int i=0; i<count; i++){
            System.out.print(first + " ");
            // calculate next term
            int next = first +second;
            first = second;
            second = next ;
        }
    }
}
