package com.java.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("A");
        t.add("C");
        t.add("E");
        t.add("D");
        System.out.println(t);
    }
}
class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        String S1 = (String) o1;
        String S2 = (String) o2;
        return S1.compareTo(S2);
    }
}
