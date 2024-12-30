package com.vishal.practice.thread_practice;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();
    }
}
