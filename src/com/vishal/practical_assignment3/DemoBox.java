package com.vishal.practical_assignment3;
import java.util.Scanner;
class Box {
    private int l,b,h;
    private int volume;
    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length : ");
        l = scanner.nextInt();
        System.out.print("Enter Breath : ");
        b = scanner.nextInt();
        System.out.print("Enter Height : ");
        h = scanner.nextInt();
    }
    public void putData(){
        System.out.println("Box{" +
                "b=" + b +
                ", l=" + l +
                ", h=" + h +
                ", volume=" + volume +
                '}');
    }

    public void calculateVolume(){
        volume = l*b*h;
    }

    public Box findMaxVolume(Box other){
        return (this.volume>other.volume)?this:other;
    }
}
public class DemoBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.getData();
        box1.calculateVolume();
        box1.putData();
        Box box2 = new Box();
        box2.getData();
        box2.calculateVolume();
        box2.putData();
        Box maxVolume = box1.findMaxVolume(box2);
        System.out.println("Box with maximum volume");
        maxVolume.putData();
    }
}
