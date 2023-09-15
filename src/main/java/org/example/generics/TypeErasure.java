package org.example.generics;

public class TypeErasure {
    public static void main(String[] args) {
        Info2<String>info1 = new Info2<>("privet");
        System.out.println(info1);
        String s1 = info1.getValue();

        Info2<Integer>info2 = new Info2<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();
    }
}

class Info2<T>{ //T -Type place holder
    private T value; // переменная не может быть статична (статичная переменная - это одна переменная для всех объектов класса)

    public Info2(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{["+value+"]}";
    }
    public T getValue(){
        return value;
    }
}
class Parent{
    public void abc(Info2<String>info){
        String s = info.getValue();
    }
}
