package com.vishal.practical_assignment3.static_examples;

import java.util.Scanner;

class Employee{
    private int eid;
    private String ename;
    private int salary;

    private static int count = 0;
    public static void countEmployee(){
        System.out.println("Total employees : "+count);
    }
    public Employee() {}
    public Employee(int eid) {
        this.eid = eid;
        count++;
    }

    public Employee(int eid, String ename, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        count++;
    }
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        ename = scanner.nextLine();
        System.out.print("Enter salary : ");
        salary = scanner.nextInt();
    }
    public void putData(){
        System.out.println("Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}');
    }

    public Employee findMax(Employee employee) {
        return (this.salary > employee.salary) ? this : employee;
    }

    public static Employee findMax(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            max = max.findMax(employees[i]);
        }
        return max;
    }
}
public class DemoEmp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(i + 1);
            employees[i].getData();
            employees[i].putData();
        }
        Employee max = new Employee();
        for (int i = 0; i < employees.length; i++) {
            max = max.findMax(employees[i]);
        }
        System.out.print("Employee with maximum salary : ");
        max.putData();
        Employee.countEmployee();
    }
}
