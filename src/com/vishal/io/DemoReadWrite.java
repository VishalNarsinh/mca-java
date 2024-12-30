package com.vishal.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DemoReadWrite {
    public static void main(String[] args) {
        BufferedReader br=null;
        PrintWriter out = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out,true);
            System.out.print("Enter your name : ");
            String name = br.readLine();
            System.out.println("Your name is : " + name);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try{
                br.close();
                out.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
