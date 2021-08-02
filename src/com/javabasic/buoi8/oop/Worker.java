package com.javabasic.buoi8.oop;

public class Worker extends Employee {
    public Worker(String name, String age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
