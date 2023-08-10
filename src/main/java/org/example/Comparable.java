package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {
        List<Employee>list = new ArrayList<>();
        Employee emp1 = new Employee(100,"Petya","Ivanov",100000);
        Employee emp2 = new Employee(15,"Olga","Belova",150000);
        Employee emp3 = new Employee(25,"Olga","Sidorova",80000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);
    }
}

class Employee implements java.lang.Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        return this.id-anotherEmp.id;
        int res = this.name.compareTo(anotherEmp.name);
        if(res==0){
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
