package com.java;

import java.util.Scanner;

public class SumUsingFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number (n) : ");
        int n =sc.nextInt();
        int sum = n*(n+1)/2 ;
        System.out.println(" Sum of first "+ n + " natural number is : " + sum);
    }
}
