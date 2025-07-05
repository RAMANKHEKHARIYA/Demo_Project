package com.java;

public class MathLogics {
    public static void main(String[] args) {

        //   int a = 12, b =13 ;
        //    int c = a+b;                // SUM OF TWO NUMBER
        //    int d = a-b;                // Subtraction of two number
        //    System.out.println( "Sum of two number is : " +(a+b));
        //    System.out.println("Subtraction of two number is :" +(a-b));


//     int x =15,y=5;
//        System.out.println("Division of two number is : " +(x/y));
//        System.out.println("Multiply of two number is :" +(x*y));
//        System.out.println("Mode of two number is : " +(x%y));

//        int i, num = 17;
//        String result="";
//        for (i = 3; i <= num / 2; i = i + 2) {
//        for (i = 3; i <= Math.sqrt(num); i = i + 2) {
//            if (num % i == 0) {
//                result = "Number is not prime";
//                break;
//            }
//            else {
//                result = "Number is prime";
//
//            }
//
//        }
//        System.out.println(result);

        String result = "" ;
        String str = "Raman";
        int i;
        for(i=str.length()-1; i>=0 ; i--){
            result = result + str.charAt(1);
        }
    }
}

