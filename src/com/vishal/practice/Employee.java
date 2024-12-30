package com.vishal.practice;

import java.io.*;
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
    static void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Method with varargs for integer parameters
    static void add(int... numbers) {  // Varargs should be last
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
    public static void main(String[] args) {
//        Employee employee1 = new Employee(1, 1000);
//        Employee employee2 = new Employee(2, 2000);
//        Employee employee3 = new Employee(3, 3000);
//        Employee employee4 = new Employee(4, 4000);
//        Employee employee5 = new Employee(5, 5000);
//        System.out.println(Employee.getTotalSalary());
//        Employee.add(1,2);
//        char c;
//        try{
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            PrintWriter pr=new PrintWriter(System.out,true);
//            System.out.println("Enter characters, 'q' to quit.");
//            // read characters
//            do {
//                c = (char) br.read();
//                pr.println(c);
//            } while(c != 'q');
//        }
//        catch (Exception e){
//
//        }
        try (FileInputStream infile = new FileInputStream("C:\\Users\\vishal\\Documents\\new-spring-workspace\\mca-java\\src\\com\\vishal\\practice\\1.txt")) {
            int b;
            while (infile.available() > 0) {
                System.out.print(infile.available()+" ");
                System.out.println((char) infile.read());  // Print the character read
            }
        }
        catch (IOException e) {
            e.printStackTrace();  // Handle file-related errors
        }
//        try (FileReader reader = new FileReader("C:\\Users\\vishal\\Documents\\new-spring-workspace\\mca-java\\src\\com\\vishal\\practice\\1.txt")) {
//            int b;
//            while ((b = reader.read()) != -1) {
//                System.out.print((char) b);  // Print each character from the file
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();  // Handle file-related errors
//        }

    }
}
