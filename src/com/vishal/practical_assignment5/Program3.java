package com.vishal.practical_assignment5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(20/0);
        try{
            Scanner scanner = new Scanner(System.in);
//            System.out.println(arr[5]);
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + " : ");
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+"/2 = "+arr[i]/2);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handled "+e);
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
