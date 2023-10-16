package org.example.collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add("Kolya");
        al1.add("Elena");

        Iterator<String> iterator = al1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //удаление с помощью итератора:
        Iterator<String> iterator2 = al1.iterator();
        while (iterator2.hasNext()){
            iterator2.next();
           iterator2.remove();
        }
    }
}
