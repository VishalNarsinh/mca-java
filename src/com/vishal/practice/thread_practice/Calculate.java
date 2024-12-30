package com.vishal.practice.thread_practice;

public class Calculate {
    public static void main(String[] args) throws InterruptedException {
        AddSum a = new AddSum();
        Adder add1to20 = new Adder(1,20,a);
        Adder add21to40 = new Adder(21,40,a);
        Adder add41to60 = new Adder(41,60,a);
        Adder add61to80 = new Adder(61,80,a);
        Adder add81to100 = new Adder(81,100,a);
        add1to20.start();
        add21to40.start();
        add41to60.start();
        add61to80.start();
        add81to100.start();
        add1to20.join();
        add21to40.join();
        add41to60.join();
        add61to80.join();
        add81to100.join();
        System.out.println(a.getSum());
//        System.out.println(add1to20.getSum()+add21to40.getSum()+add41to60.getSum()+add61to80.getSum()+add81to100.getSum());
    }
}
class Adder extends Thread{
    AddSum a;
    private final int start,end;
    int sum=0;
    public Adder(int start,int end,AddSum a){
        this.a=a;
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        a.addSum(sum);
    }
}
