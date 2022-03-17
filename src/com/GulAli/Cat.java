package com.GulAli;

class Cat implements Animal {

public String name;
    @Override
    public void displayInfo() {
        System.out.println("Cat information. Name : " + this.name);
    }

    @Override
    public String getAnimalName() {
        return this.name;
    }
}
