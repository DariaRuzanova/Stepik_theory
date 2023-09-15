package org.example.collections.setInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {//использовать тогда, когда нужен hashSet, который запоминает последовательность добавления элементов
    public static void main(String[] args) {
        LinkedHashSet<Integer>linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.remove(8));
        System.out.println(linkedHashSet.contains(8));
    }
}
