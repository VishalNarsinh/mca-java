package com.vishal.practical_assignment2.method_overloading;
public class Box {
    public int volume(int dimension){
        return (int)Math.pow(dimension,3);
    }
    public int volume(int dimension,int height){
        return (int)Math.pow(dimension,2)*height;
    }
    public int volume(int length,int breath,int height){
        return length*breath*height;
    }
    public float volume(float length,float breath,float height){
        return length*breath*height;
    }
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("Area of Box with same dimensions (l=b=h) = "+box1.volume(3));
        System.out.println("Area of Box with two same dimension and height (l=b and h) = "+box1.volume(3,2));
        System.out.println("Area of Box with all different dimension = "+box1.volume(4,5,6));
        System.out.println("Area of Box with all different dimension in decimal point"+box1.volume(1.2f,2.3f,3.4f));
    }
}
