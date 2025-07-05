package com.java.list;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList a = new ArrayList();
//        a.add("A");
//        a.add(10);
//        a.add("A");
//        a.add(null);
//        System.out.println(a);
//        a.remove(2);
//        System.out.println(a);
//        a.add(2,"M");
//        a.add("N");
//        System.out.println(a);
        ArrayList a = new ArrayList();

//        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add("Raman");
        a.add("Kumar");
        a.add(5000);
        a.add(null);
        a.add(12);
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        a.add(3,"Dell");
        a.remove(4);
        System.out.println(a);
        a.add(4,"Laptop");
        System.out.println(a);
        a.add(null);
        System.out.println(a);

        Collections.synchronizedList(a);
        System.out.println(a);
        // Synchronized Version Of Array List

        Map<String,Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("hbd", 1);
        System.out.println(map);
        map.put("abc", 2);
        System.out.println(map);
        map.put("cbe", 1);
        System.out.println(map);
    }
}

