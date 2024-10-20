package com.vishal.practical_assignment4.interface_prg;
interface Phone{
    void phoneStorage();
    void phoneRAM();
}
class Samsung implements Phone {

    @Override
    public void phoneStorage() {
        System.out.println("Samsung storage is 128GB.");
    }

    @Override
    public void phoneRAM() {
        System.out.println("Samsung RAM is 8GB.");
    }
}

class Apple implements Phone {

    @Override
    public void phoneStorage() {
        System.out.println("Apple storage is 256GB.");
    }

    @Override
    public void phoneRAM() {
        System.out.println("Apple RAM is 6GB.");
    }
}

class Vivo implements Phone {

    @Override
    public void phoneStorage() {
        System.out.println("Vivo storage is 64GB.");
    }

    @Override
    public void phoneRAM() {
        System.out.println("Vivo RAM is 4GB.");
    }
}

public class Program10 {
    public static void main(String[] args) {
        Phone samsung = new Samsung();
        Phone apple = new Apple();
        Phone vivo = new Vivo();

        System.out.println("Samsung Phone Details:");
        samsung.phoneStorage();
        samsung.phoneRAM();

        System.out.println("\nApple Phone Details:");
        apple.phoneStorage();
        apple.phoneRAM();

        System.out.println("\nVivo Phone Details:");
        vivo.phoneStorage();
        vivo.phoneRAM();
    }
}
