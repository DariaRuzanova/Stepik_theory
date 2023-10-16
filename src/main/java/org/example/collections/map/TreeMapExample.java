package org.example.collections.map;



import org.example.collections.map.Student2;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student2> treeMap = new TreeMap<>();
        Student2 st1 = new Student2("Zaur", "Tregulov", 4);
        Student2 st2 = new Student2("Mariya", "Ivanova", 1);
        Student2 st3 = new Student2("Ivan", "Petrov", 2);
        Student2 st4 = new Student2("Igor", "Sidorov", 4);
        Student2 st5 = new Student2("Vasiliy", "Smirnov", 1);
        Student2 st6 = new Student2("Oleg", "Petrov", 2);
        Student2 st7 = new Student2("Elena", "Blinova", 4);



        treeMap.put(5.8, st1);
        treeMap.put(6.2, st2);
        treeMap.put(8.7, st3);
        treeMap.put(3.4, st4);
        treeMap.put(9.2, st5);
        treeMap.put(6.8, st6);
        treeMap.put(7.8, st7);//уникальность ключей должна быть соблюдена как и в HashMap
        // Красно-черное дерево - дерево, у каждого элемента которого не более 2-х потомков, правый элемент которого больше
//        больше левого. Красно-черное дерево самобалансирующееся(оно будет перегруппировываться чтобы быть равномерным)
//        с помощью таких деревьев методы containsKey, put... обрабатываются за О(logn) здесь идет бинарный поиск

        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.2));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));

        System.out.println(treeMap.lastEntry());//наибольшее значение ключа
        System.out.println(treeMap.firstEntry());

        TreeMap<Student2, Double> treeMap2 = new TreeMap<>();
        treeMap2.put(st1, 5.2);
        treeMap2.put(st2, 7.3);
        treeMap2.put(st3, 9.2);
        treeMap2.put(st4, 6.8);
        treeMap2.put(st5, 7.7);
        treeMap2.put(st6, 3.4);
        treeMap2.put(st7, 8.8);
        System.out.println(treeMap2);

//        TreeMap<Student2, Double> treeMap3 = new TreeMap<>(new Comparator<Student2>() {
//            @Override
//            public int compare(Student2 o1, Student2 o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        treeMap3.put(st1, 5.2);
//        treeMap3.put(st2, 7.3);
//        treeMap3.put(st3, 9.2);
//        treeMap3.put(st4, 6.8);
//        treeMap3.put(st5, 7.7);
//        treeMap3.put(st6, 3.4);
//        treeMap3.put(st7, 8.8);
//        System.out.println(treeMap3);


    }
}

