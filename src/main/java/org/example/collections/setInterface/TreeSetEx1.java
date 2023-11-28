package org.example.collections.setInterface;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Oleg",1);
        Student st3 = new Student("Pavel",3);
        Student st4 = new Student("Elena",2);
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        System.out.println(studentSet);
        System.out.println(studentSet.stream().findFirst());
        System.out.println(studentSet);
        Student st5 = new Student("Masha",5);


        System.out.println(st1.equals(st5));
    }

}
class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student auther) {
        return this.course-auther.course;
    }
}
