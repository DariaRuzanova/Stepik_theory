package org.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("Ivan");
        al1.add("Mariya");
        al1.add("Kolya");
        al1.add("Elena");
        System.out.println(al1);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Ivan");
        al2.add("Mariya");
        al2.add("Igor");
//        al1.removeAll(al2);
//        al1.retainAll(al2);
//        System.out.println(al1);

//        boolean res = al1.contains(al2);
//        System.out.println(res);

//        List<String>myList = al1.subList(1,4); //второй параетр не включен/ он не существует по отдельности от al1, это сущность al1 (view)
//        System.out.println(myList);
//        myList.add("Fedor");
//        System.out.println(myList);
//        System.out.println(al1);
//
//        Object[] array = al1.toArray();
//        String[] array2 = al1.toArray(new String[0]);
//        for (String S:array2
//             ) {
//            System.out.println(S);
//
//        }

        List<Integer>list1 =List.of(5,3,8,13);
        System.out.println(list1);

//        list1.add(100); // добавлять элементны в лист, созданный с помощью List.of нельзя
//
        List<String>list2 = List.copyOf(al1); // этот лист так же нельзя изменять и не содержит null
        System.out.println(list2);


    }
}
