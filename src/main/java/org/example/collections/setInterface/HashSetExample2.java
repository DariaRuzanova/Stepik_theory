package org.example.collections.setInterface;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(3);

        HashSet<Integer>set2=new HashSet<>();
        set2.add(5);
        set2.add(7);
        set2.add(4);
        set2.add(8);
        set2.add(3);

        HashSet<Integer>union=new HashSet<>(set);
        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer>intersect=new HashSet<>(set);
        intersect.retainAll(set2);
        System.out.println(intersect);

        HashSet<Integer>subtract=new HashSet<>(set);
        subtract.removeAll(set2);
        System.out.println(subtract);
    }
}
