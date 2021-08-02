package com.javabasic.buoi8.abstractexample;


public class Bird extends Animal {
    @Override
    public void animalSound() {
        System.out.println("chiep chiep ....");
    }

    @Override
    public void move() {
        System.out.println("by swing, fly....");
    }
}
