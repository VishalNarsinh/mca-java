package com.vishal.practical_assignment3;

public class Complex {

    private int real;
    private int imaginary;

    public Complex() {
        this.real = this.imaginary = 0;
    }

    public Complex(int value){
        this.real = this.imaginary = value;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex complex1, Complex complex2) {
        return new Complex(complex1.real + complex2.real, complex1.imaginary + complex2.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    @Override
    public boolean equals(Object obj) {
        Complex complex = (Complex) obj;
        return this.real == complex.real && this.imaginary == complex.imaginary;
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 2);
        Complex complex2 = new Complex(2, 3);
        Complex complex3 = Complex.add(complex1, complex2);
        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex3);
        Complex complex4 = new Complex(1, 2);
        System.out.println(complex1.equals(complex4));
        System.out.println(complex1.equals(complex2));
    }
}
