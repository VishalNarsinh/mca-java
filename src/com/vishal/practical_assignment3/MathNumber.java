package com.vishal.practical_assignment3;

public class MathNumber {
    private int a,b;

    public MathNumber() {
        this.a=this.b=0;
    }
    public MathNumber(int a) {
        this.a = a;
        this.b = a;
    }
    public MathNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MathNumber{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        MathNumber n1 = new MathNumber();
        MathNumber n2 = new MathNumber(10);
        MathNumber n3 = new MathNumber(10, 20);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
