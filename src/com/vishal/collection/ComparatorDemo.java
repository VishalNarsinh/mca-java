package com.vishal.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class EmployeeNameComparotor implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
class EmployeeIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Employee jack = new Employee(3, "Jack");
        Employee alice = new Employee(2, "Alice");
        Employee jill = new Employee(4, "Jill");
        Employee john = new Employee(1, "John");
        Employee sarah = new Employee(6, "Sarah");
        Employee david = new Employee(5, "David");
        List<Employee> list = new ArrayList<>();
        list.add(john);
        list.add(alice);
        list.add(jack);
        list.add(jill);
        list.add(david);
        list.add(sarah);
        System.out.println("Sorting by name");
        list.sort((e1,e2)-> e1.name.compareTo(e2.name));
        list.forEach(System.out::println);
        System.out.println("Sorting by ID");
//        list.sort((e1,e2)-> e1.id - e2.id);
        list.sort(new EmployeeIdComparator());
        list.forEach(System.out::println);
    }
}
