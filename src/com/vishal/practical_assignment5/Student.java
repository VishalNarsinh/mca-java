package com.vishal.practical_assignment5;

public class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) throws MarksOutOfBoundException {
        if(marks>100)
            throw new MarksOutOfBoundException("Marks cannot be greater than 100");
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.setMarks(101);
            System.out.println(s1.getMarks());
        } catch (MarksOutOfBoundException e) {
            e.printStackTrace();
        }
        System.out.println("End of Program");
    }
}
class MarksOutOfBoundException extends Exception{

    public MarksOutOfBoundException(String message) {
        super(message);
    }
}