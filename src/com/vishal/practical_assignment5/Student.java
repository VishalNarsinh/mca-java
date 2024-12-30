package com.vishal.practical_assignment5;

public class Student {
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) throws MarksOutOfBoundException {
        if(marks>100)
            throw new MarksOutOfBoundException();
        this.marks = marks;
    }

    public static void main(String[] args) throws MarksOutOfBoundException {
        Student s1 = new Student();

            s1.setMarks(101);
            System.out.println(s1.getMarks());

        System.out.println("End of Program");
    }
}
class MarksOutOfBoundException extends Exception{

//    public MarksOutOfBoundException(String message) {
//        super(message);
//    }
}