package org.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student2,Double>map = new HashMap<>(); //Рекомендуется, объект, стоящий на месте ключа делать неизменяемым
        Student2 st1 = new Student2("Zaur","Tregulov",4);
        Student2 st2 = new Student2("Mariya","Ivanova",1);
        Student2 st3 = new Student2("Ivan","Petrov",2);
        map.put(st1,7.5);
        map.put(st2,6.8);
        map.put(st3,8.8);
        System.out.println(map);
        System.out.println(st1.hashCode());
//        st1.course = 5;
        System.out.println(st1.hashCode());

        for(Map.Entry<Student2,Double> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        Map<Integer, String> map2 = new HashMap<>(16,0.75f); //InitialCapacity - в результате создания будет создан массив с 16-ю элементами
        // loadFactor = 16*0.75 - после того как в наш hashMap будет добавлено 12 элементов, размер нашего массива увеличится вдвое и все элементы будут заново рехэшированы
        //чем больше мы укажем capacity, тем больше hashMap будет создан и тем меньше вероятность создания длинного linkedList,поиск будет быстрее
    }
}

final class  Student2 implements Comparable<Student2>{
    private final String name;
    private final String surname;
    private final int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course && Objects.equals(name, student2.name) && Objects.equals(surname, student2.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);//необходимо корректно реализовать метод hashCode() чтобы вставка, поиск в Map(LinkedList) работала лучше.
        //При стандартной реализации hashCode() скорость поиска или вставки элкмента в HashMap равно О(1) - лучший случай, в худшем случае O(n)
        //В Java 8 после достижения определенного порога вместо связанных списков используются сбалансированные деревья. Сначала HashMap сохраняет объекты в LinkedList
        //но после достижения определенного порога скорость операций падает и хранение происходит в сбалансированном дереве(справа находится больший элемент, слева - меньший)
        // в этом случае скорость станет О(logn), а не O
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }
}
