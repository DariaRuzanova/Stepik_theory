package org.example.collections.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String>vector = new Vector<>(); //вектор, по сравнению с ArrayList и LinkedList предназначен для работы в многопоточности.
        //Но вектор не советуют использовать
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
