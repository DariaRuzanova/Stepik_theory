package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(100, "Petya", "Ivanov", 100000);
        Employee2 emp2 = new Employee2(15, "Olga", "Belova", 150000);
        Employee2 emp3 = new Employee2(25, "Olga", "Sidorova", 80000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: " + list);
        Collections.sort(list); //сортировка с использованием интерфейса Comparable
        Collections.sort(list,new NameComparator()); //сортировка с использованием доп параметра (класс Comparator)
        System.out.println("After sorting: " + list);
    }
}

class Employee2 implements java.lang.Comparable<org.example.Employee2> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
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
        public int compareTo(org.example.Employee2 anotherEmp) {
        return this.id-anotherEmp.id;
//            int res = this.name.compareTo(anotherEmp.name);
//            if(res==0){
//                res = this.surname.compareTo(anotherEmp.surname);
//            }
//            return res;
        }
}

//class IdComparator implements java.util.Comparator<Employee2> {
//    @Override
//    public int compare(Employee2 o1, Employee2 o2) {
//        if (o1.id == o2.id) {
//            return 0;
//        } else if (o1.id < o2.id) {
//            return -1;
//        }
//        return 1;
//    }
//}
class NameComparator implements java.util.Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name.compareTo(o2.name);
    }
}


