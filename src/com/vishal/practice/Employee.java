package com.vishal.practice;

import java.util.Scanner;

class Employee {
    private int eid;
    private int salary;

    private static int count = 0;
    private static int totalSalary = 0;

    public static int getTotalSalary() {
        return totalSalary;
    }

    public static void countEmployee(){
        System.out.println("Total employees : "+count);
    }
    public Employee() {}
    public Employee(int eid) {
        this.eid = eid;
        count++;
    }

    public Employee(int eid, int salary) {
        this.eid = eid;
        this.salary = salary;
        totalSalary += salary;
        count++;
    }
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary : ");
        salary = scanner.nextInt();
        totalSalary += salary;
        scanner.close();
    }
    public void putData(){
        System.out.println("Employee{" +
                "eid=" + eid +
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

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, 1000);
        Employee employee2 = new Employee(2, 2000);
        Employee employee3 = new Employee(3, 3000);
        Employee employee4 = new Employee(4, 4000);
        Employee employee5 = new Employee(5, 5000);
        System.out.println(Employee.getTotalSalary());
    }
}
