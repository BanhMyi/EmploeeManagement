package com.javabasic.buoi8.abstractexample;


public class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Go   Goooo");
    }

    @Override
    public void move() {
        System.out.println("by foot, on the land...");
    }
}
