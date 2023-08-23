package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCard {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();//List wildCard явзяется супертипом для любого аррай листа/ Вместо ? может применяться любой тип

        List<?extends Number> list30 = new ArrayList<Integer>();
        List<?super Number> list31 = new ArrayList<>();//bounded wildcard

        List<Double>list1 = new ArrayList<>();
        list1.add(3.15);
        list1.add(3.14);
        showListInfo(list1);

        List<String>list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("cde");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(5.55);
        ald.add(3.189);
        System.out.println(sum(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(20);
        ali.add(55);
        ali.add(3);
        System.out.println(sum(ali));
    }
    static void showListInfo(List<?>list){
        System.out.println("Лист содержит "+list);
    }
    public static Double sum(ArrayList <? extends Number> al){
        double sum = 0;
        for(Number n: al){
            sum+=n.doubleValue();
        }
        return sum;
    }
}
