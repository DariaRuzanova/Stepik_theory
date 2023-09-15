package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X> list1 = new ArrayList<Y>(); // не будет работать
        List<Number> list = new ArrayList<>();

    }
}

class X{

}

class Y extends X{

}
