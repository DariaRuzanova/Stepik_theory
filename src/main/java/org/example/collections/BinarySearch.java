package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        Integer [] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
        List<Integer>arrayList = Arrays.asList(array);
        Collections.sort(arrayList);
        int ind1 = Collections.binarySearch(arrayList,12); // поиск элемента делением пополам
        System.out.println(ind1);

        Collections.reverse(arrayList);//разворот коллекции
        System.out.println(arrayList);

        Collections.shuffle(arrayList); //метод перемешивает элементы arrayList
        System.out.println(arrayList);

        Employee emp1 = new Employee(100,"Zaur",12345);
        Employee emp2 = new Employee(15,"Ivan",6512);
        Employee emp3 = new Employee(123,"Petr",98000);
        Employee emp4 = new Employee(15,"Mariya",157121);
        Employee emp5 = new Employee(182,"Kolya",12321);
        Employee emp6 = new Employee(15,"Sasha",12000);
        Employee emp7 = new Employee(250,"Elena",12345);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);

        int index2 = Collections.binarySearch(employeeList,new Employee(182,"Kolya",12321));
        System.out.println(index2);


        int [] arrays = {-3,8,12,-8,0,5,10,1,150,-30,19};
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        int ind3 = Arrays.binarySearch(arrays,150);
        System.out.println(ind3);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int res = this.id - anotherEmp.id;
        if(res==0){
            res = this.name.compareTo(anotherEmp.name);
        }
        return res;
    }
}
