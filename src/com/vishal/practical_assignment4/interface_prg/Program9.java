package com.vishal.practical_assignment4.interface_prg;

interface Bird{
    public void birdColor();
    void foodEat();
}
class Sparrow implements Bird{

    @Override
    public void birdColor() {
        System.out.println("Sparrow's color is brown and gray.");
    }

    @Override
    public void foodEat() {
        System.out.println("Sparrow eats seeds and insects.");
    }
}
class Parrot implements Bird{

    @Override
    public void birdColor() {
        System.out.println("Parrot's color is green with a red beak.");
    }

    @Override
    public void foodEat() {
        System.out.println("Parrot eats fruits, seeds, and nuts.");
    }
}
class Crow implements Bird{

    @Override
    public void birdColor() {
        System.out.println("Crow's color is black.");
    }

    @Override
    public void foodEat() {
        System.out.println("Crow eats almost anything, including insects, grains, and food waste.");
    }
}
public class Program9 {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.birdColor();
        sparrow.foodEat();
        Bird parrot = new Parrot();
        parrot.birdColor();
        parrot.foodEat();
        Bird crow = new Crow();
        crow.birdColor();
        crow.foodEat();
    }
}
