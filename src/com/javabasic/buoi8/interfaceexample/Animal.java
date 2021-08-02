package com.javabasic.buoi8.interfaceexample;

public interface Animal {

     void animalSound();
     void move();

     public default void sleep() {
         System.out.println("Z..z...");
     }

     public static void eat() {

     }
}
