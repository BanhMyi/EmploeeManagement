package com.javabasic.buoi8.interfaceexample;


public class Bird implements Animal {
    @Override
    public void animalSound() {
        System.out.println("chiep chiep ....");
    }

    @Override
    public void move() {
        System.out.println("by swing, fly....");
    }
}
