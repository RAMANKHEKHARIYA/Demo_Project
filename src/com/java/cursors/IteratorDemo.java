package com.java.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        for (int i=0; i<=20; i++)
            l.add(i);
        System.out.println(l);
        Iterator itr = l.iterator();        // l is collection object
        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            if (i%2==0)
                System.out.println(i);
            else
                itr.remove();
        }
        System.out.println(l);
    }
}
