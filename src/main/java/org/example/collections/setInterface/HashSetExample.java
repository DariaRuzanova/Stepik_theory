package org.example.collections.setInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();//множество, которое не может содержать дубликаты. В основе HashSet лежит HashMap,в качестве значений которых некоторые константы
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        set.add("Igor");
        set.add(null);
        System.out.println(set);
        set.remove("Igor");

        for (String s: set) {
            System.out.println(s);

        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));



    }
}
