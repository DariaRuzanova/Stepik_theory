package org.example.collections;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();//так же как и Vector,явзяется synchronized классом и редко используется
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println(stack);
        System.out.println(stack.pop());//удаляет верхний элемент из стека и выводит его
        System.out.println(stack);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());//выдает верхний элемент, значение не удаляет из стека
        System.out.println(stack);
    }
}
