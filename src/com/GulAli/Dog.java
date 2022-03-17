package com.GulAli;

class Dog implements Animal {
    public String name;
    @Override
    public void displayInfo() {
        System.out.println("I am a dog and my name is " + this.name);
    }
}
