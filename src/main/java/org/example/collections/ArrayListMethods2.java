package org.example.collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",22,3,'m',8.3);
        Student st2 = new Student("Elena",18,1,'f',7.5);
        Student st3 = new Student("Olya",20,2,'f',6.3);
        Student st4 = new Student("Petr",28,5,'m',9.3);
        Student st5 = new Student("Maria",24,4,'f',6.8);
        ArrayList<Student>studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        System.out.println(studentArrayList);
        Student st6 = new Student("Maria",24,4,'f',6.8);
//        studentArrayList.remove(st6);
//        System.out.println(studentArrayList);

        int index = studentArrayList.indexOf(st6); //необходимо правильно переопределить метод equals
        System.out.println(index);


    }
}
class Student{
    private String name;
    private int age;
    private int course;
    private char sex;
    private double avgGrade;

    public Student(String name, int age, int course, char sex, double avgGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.sex = sex;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", sex=" + sex +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && sex == student.sex && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }


}
