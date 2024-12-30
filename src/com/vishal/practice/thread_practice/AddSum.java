package com.vishal.practice.thread_practice;

public class AddSum {
    int sum=0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    synchronized void addSum(int finalSum) {
        sum += finalSum;
//        notifyAll();
    }
}

