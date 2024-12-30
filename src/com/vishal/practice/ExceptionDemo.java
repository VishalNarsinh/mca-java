package com.vishal.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
    void processFile() throws Exception{

            FileInputStream fis = new FileInputStream("abc.txt");

        System.out.println("Program ended");
    }

    public static void main(String[] args) throws Exception {
        ExceptionDemo d = new ExceptionDemo();
//        d.processFile();
        try {
            System.out.println(10/0);
        }catch (Throwable throwable){
            System.out.println(throwable.toString());
        }
    }
}
