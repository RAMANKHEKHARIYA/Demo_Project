package com.java.exception;

//import java.io.IOException;
//import java.sql.SQLException;

//public class CompileTimeExceptionCheck {
//    public static void main(String[] args) throws Exception {
//        CompileTimeExceptionCheck obj = new CompileTimeExceptionCheck();
////        System.out.println(obj.method1());
//        System.out.println(obj.method());
//    }
//    //In try-catch we never use te Compile time EXception.
//    public int method() throws Exception {
//        int num=12;
//        try {
//            System.out.println(num/0);
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//            throw new Exception(("devided Zero"));
//        }
//        catch (Exception e){
//            throw new Exception(("devided by Zero"));
//
//        }finally {
//            System.exit(1);         //Exceptional Case finlally block can't execute
//            System.out.println("Hi I am Raman");
//            System.out.println("Hi I am Raman");
//            try{}
//            catch(Exception e){
//
//            }
//        }
//        return 0;
//        System.out.println(num/0);
//            throw new Exception(("devided Zero"));

//    }

//    public String method1() throws SQLException, IOException {
//
//        boolean avc=true;
//
//        if(!avc) {
//            System.out.println("Exception");
//            throw new IOException();
//        }
//        return "Raman";
//    }
//}

         // Try-Catch

//class Example1{
//    public static void main(String[] args) {
//        try{
//            int a = 1/0;
//        }
//        catch (ArithmeticException e) {
//            System.out.println("cannot divide by zero");
//        }
//    }
//}

        // Multiple Catch block

//class Example2{
//    public static void main(String[] args) {
//        try{
//            int a[]=new int[5];
//            a[10] = 12;
//        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmatic problem");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array Index is out of bound");
//        }
//        catch (Exception e){
//            System.out.println("General Exception caught");
//        }
//    }
//}


      // Finally block

//class Example3{
//    public static void main(String[] args) {
//        try{
//            int data= 14/0;
//            System.out.println("Result : " +data);
//        }
//        catch (Exception e){
//            System.out.println("Error detected");
//        }
//        finally{
//            System.out.println("always be executed");
//        }
//    }
//}


         // throw keyword

 class Example4 {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}

