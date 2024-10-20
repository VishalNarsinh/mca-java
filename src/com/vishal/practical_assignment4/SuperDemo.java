package com.vishal.practical_assignment4;

class Parent{
    int a;

    public Parent(int a) {
        this.a = a;
    }
    void show(){
        System.out.println("Class A show method, A = "+a);
    }
}
class Child extends Parent{
    int a,b;

    public Child(int pa,int a, int b) {
        super(pa);
        this.a = a;
        this.b = b;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Accessing member 'a' of Parent class "+super.a);
        System.out.println("Class B show method, A = "+a+", B = "+b);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Parent ref = new Child(10,20,30);
        ref.show();
    }
}
