package com.GulAli;

class Cat implements Animal {

public String name;
    @Override
    public void displayInfo() {
        System.out.println("I am a cat and my name is " + this.name);
    }
}
