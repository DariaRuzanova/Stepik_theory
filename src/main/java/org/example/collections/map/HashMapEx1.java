package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(12345,"Ivan Ivanov");
        map1.put(1245,"Mariya Sidorova");
        map1.put(2456,"Petr Petrov");
        map1.putIfAbsent(12345,"Petr Petrov");
        map1.put(null,"Petr Petrov");
        map1.put(45678,null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(12345);
        System.out.println(map1.containsValue("Иван Иванов"));
        System.out.println(map1.containsKey(12345));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha","добрый");
        map2.put("Misha","умный");
    }
}
