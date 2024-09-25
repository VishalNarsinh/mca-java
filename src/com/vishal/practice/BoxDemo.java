package com.vishal.practice;

class Box{
    private int l,b,h;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int volume(int l,int b,int h){
        return l*b*h;
    }

    public boolean isVolumeEqual(Box box){
        return this.volume(this.l,this.b,this.h)==box.volume(box.getL(),box.getB(),box.getH());
    }


    public Box findBoxWithEveryDimensionsBigger(Box box){
        if(this.l>box.getL() && this.b>box.getB() && this.h>box.getH()){
            return this;
        }else if(box.getL()>this.l && box.getB()>this.b && box.getH()>this.h){
            return box;
        }else
            return null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "b=" + b +
                ", l=" + l +
                ", h=" + h +
                '}';
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setL(100);
        box1.setB(100);
        box1.setH(100);
        Box box2 = new Box();
        box2.setL(10);
        box2.setB(10);
        box2.setH(10);
        System.out.println(box1.isVolumeEqual(box2));
        System.out.println(box1.findBoxWithEveryDimensionsBigger(box2));
    }
}
