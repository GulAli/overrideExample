package com.GulAli;

class Dog implements Animal {
    public String name;
    @Override
    public void displayInfo() {
        System.out.println("Dog information. Name : " + this.name);
    }

    @Override
    public String getAnimalName() {
        return this.name;
    }
}
