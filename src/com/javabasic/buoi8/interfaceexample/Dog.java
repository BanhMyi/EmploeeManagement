package com.javabasic.buoi8.interfaceexample;


public class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Go   Goooo");
    }

    @Override
    public void move() {
        System.out.println("by foot, on the land...");
    }
}
