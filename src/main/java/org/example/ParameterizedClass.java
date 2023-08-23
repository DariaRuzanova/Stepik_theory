package org.example;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String>info1 = new Info<>("privet");
        System.out.println(info1);
        String s1 = info1.getValue();

        Info<Integer>info2 = new Info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();

//        Info3<String>info3 = new Info3<>("privet");
//        System.out.println(info3);
//        String s3 = info3.getValue();

        Info3<Integer>info4 = new Info3<>(18);
        System.out.println(info4);
        Integer i4 = info4.getValue();

        Info3<Double>info5 = new Info3<>(18.4);
        System.out.println(info5);
        Double i5 = info5.getValue();
    }
}

class Info<T>{ //T -Type place holder
    private T value; // переменная не может быть статична (статичная переменная - это одна переменная для всех объектов класса)

    public Info(T value) {
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
class Info3<T extends Number>{ //T -Type place holder
    private T value; // переменная не может быть статична (статичная переменная - это одна переменная для всех объектов класса)

    public Info3(T value) {
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
