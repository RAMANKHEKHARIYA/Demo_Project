package com.java.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Fruit");
        l.add("1 Dozen");
        l.add(12);
        l.add(null);
        l.add("Fruit");
        System.out.print(l+" ");
        System.out.println();
        l.set(0,"Apple");
        System.out.println(l);
        System.out.println();
        l.add(0,"Banana");
        System.out.println(l);
        System.out.println();
        l.removeLast();
        System.out.println(l);
        System.out.println();
        l.addFirst("Vegetables");
        System.out.print(l+" ");
        System.out.println();
    }
}
