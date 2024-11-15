package com.vishal.practical_assignment5;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String  name, int age) throws Exception {
        this.id = id;
        this.name = name;
        if(age>100)
            throw new Exception("Age cannot be greater than 100");
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person(1, "Abc", 101);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program");
    }
}
