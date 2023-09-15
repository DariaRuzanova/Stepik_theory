package org.example.collections.List;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String>al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add(1,"Misha");
        for (String s:al1) {
            System.out.println(s+" ");
        }
        System.out.println();
//        for(int i=0; i<al1.size(); i++){
//            System.out.println(al1.get(i));
//        }
        al1.set(1,"Masha");
//        al1.remove(0);
        System.out.println(al1);

    }
}
