package com.GulAli;

class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        a1.name = "Animal";
        d1.name = "Doggy";
        c1.name = "Catty";

        a1.displayInfo();
        d1.displayInfo();
        c1.displayInfo();
    }
}

