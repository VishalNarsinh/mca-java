package com.vishal.practice.oop.method_overriding;

class Parent{
    static  void method(){
        System.out.println("Method from Parent class");
    }
}
class Child extends Parent{

    static void method() {
        System.out.println("Method from child class");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.method();
        Child c = new Child();
        c.method();
        Parent p1 = new Child();
        p1.method();
//        in case of Method hiding ,which method will be called
//        will be dependent on the type of reference
//        while in method overriding ,it is dependent of type of object
    }
}
