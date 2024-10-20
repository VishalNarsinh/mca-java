package com.vishal.practical_assignment3;

public class Number {
    private int x,y;

    public Number(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object object) {
        Number number = (Number) object;
        return this.x == number.x && this.y == number.y;
    }

    public static void main(String[] args) {
        Object number1 = new Number(10,20);
        Number number2 = new Number(10,20);
        if(number1.equals(number2)) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are not equal");
        }
        Number number3 = new Number(10,30);
        if(number1.equals(number3)) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are not equal");
        }
    }
}
