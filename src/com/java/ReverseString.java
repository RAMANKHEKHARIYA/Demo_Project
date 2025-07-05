package com.java;

public class ReverseString {
    String str1= "RamanK";
    public static void main(String[] args) {
        String str= "Raman";
        String result ="";
        for (int j = str.length()-1;j>=0;j--){
            result=result+str.charAt(j);
        }
        System.out.println(result);
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
