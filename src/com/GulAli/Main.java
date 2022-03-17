package com.GulAli;

class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();

        a1.name = "Animal";
        d1.name = "Doggy";
        d2.name = "Doggy 2";
        c1.name = "Catty";

        a1.displayInfo();
        d1.displayInfo();
        c1.displayInfo();
    }
}

class Animal {
    public String name;
    public void displayInfo() {
        System.out.println("I am an animal and my name is " + this.name);
    }

}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog and my name is " + this.name);
    }
}

class Cat extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a cat and my name is " + this.name);
    }
}