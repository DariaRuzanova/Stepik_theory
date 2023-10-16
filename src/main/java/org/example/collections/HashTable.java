package org.example.collections;

import org.example.collections.map.Student2;

import java.util.Hashtable;

public class HashTable { // не стоит использовать Если нужна поддержка многопоточности, то лучше использовать ConcurrentHashMap
    public static void main(String[] args) {
        Hashtable<Double, Student2> ht = new Hashtable<>();
        Student2 st1 = new Student2("Zaur", "Tregulov", 4);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Ivan", "Petrov", 2);
        Student2 st4 = new Student2("Igor", "Sidorov", 4);
        ht.put(7.8,st1);
        ht.put(5.2,st2);
        ht.put(9.3,st3);
        ht.put(6.6,st4);
        System.out.println(ht);

    }
}
