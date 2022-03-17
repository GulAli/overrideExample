package com.GulAli;

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();


        d1.name = "Doggy";
        c1.name = "Catty";

        d1.displayInfo();
        c1.displayInfo();

        System.out.println("My name is " + d1.getAnimalName() + ".");
        System.out.println("My name is " + c1.getAnimalName() + ".");
    }
}

