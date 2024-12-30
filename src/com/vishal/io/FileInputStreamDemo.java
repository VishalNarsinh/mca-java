package com.vishal.io;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Users\\vishal\\Documents\\new-spring-workspace\\mca-java\\src\\com\\vishal\\io\\demo.txt");
            while(fis.available()>0){
                char c = (char) fis.read();
                System.out.print(c);
            }
            fis.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
