package org.example.generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(2);
        int a = GetMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("abs");
        al2.add("cde");
        al2.add("sdf");
        String b = GetMethod.getSecondElement(al2);
        System.out.println(b);
    }
}

class GetMethod{
    public static <T> T getSecondElement(ArrayList<T>a1){
        return a1.get(1);
    }
}
