package com.vishal.practical_assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text : ");
        String line = scanner.nextLine();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();
        for(Character c : line.toCharArray()){
            if(Character.isDigit(c)){
                numbers.add(c);
            }
            else if(Character.isLetter(c)){
                letters.add(c);
            }
            else{
                specialChars.add(c);
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(specialChars);
    }
}
