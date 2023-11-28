package org.example.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(2000,"Ivan Ivanov");
        map1.put(3245,"Mariya Sidorova");
        map1.put(1234,"Nikolay Petrov");
//        map1.put(null,"SergeyPetrov");
//        map1.put(8511,null);
        map1.putIfAbsent(1000,"Oleg Ivanov");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(1234);
//        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(2000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String,String> map2 = new HashMap<>();
        map2.put("Sasha","добрый");
        map2.put("Misha","умный");
    }
}
