package com.java.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Krisana");
        l.add("Balram");
        l.add("Sheshnag");
        l.add("Laxmi");
        System.out.println(l);
        ListIterator itr = l.listIterator();
        while(itr.hasNext()){
            String s = (String) itr.next();
            if (s.equals("Balram"))
                itr.remove();
            if (s.equals("Sheshnag"))
                itr.set("Mahadev");
            if (s.equals("Laxmi"))
                itr.add("Saraswati");
        }
        System.out.println(l);
    }
}
