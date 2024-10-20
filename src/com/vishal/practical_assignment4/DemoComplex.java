package com.vishal.practical_assignment4;

class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = this.imaginary = 0;
    }

    public Complex(int value) {
        this.real = this.imaginary = value;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

}
public class DemoComplex {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 2);
        Complex complex2 = new Complex(2, 3);
        Complex complex3 = DemoComplex.add(complex1, complex2);
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);
    }
    private static Complex add(Complex complex1, Complex complex2) {
        return new Complex(complex1.getReal() + complex2.getReal(), complex1.getImaginary() + complex2.getImaginary());
    }

}

