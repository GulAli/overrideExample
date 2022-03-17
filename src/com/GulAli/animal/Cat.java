package com.GulAli.animal;

import com.GulAli.repository.Animal;

public class Cat implements Animal {

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
