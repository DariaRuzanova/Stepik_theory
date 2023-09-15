package org.example.collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student2> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);//accessOrder: true - порядок будет меняться в зависимости от того, какие элементы были использованы
        Student2 st1 = new Student2("Zaur", "Tregulov", 4);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Ivan", "Petrov", 2);
        Student2 st4 = new Student2("Igor", "Sidorov", 4);

        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.2, st2);
        linkedHashMap.put(8.7, st3);
        linkedHashMap.put(3.4, st4);

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(8.7));

        System.out.println(linkedHashMap);

    }
}
