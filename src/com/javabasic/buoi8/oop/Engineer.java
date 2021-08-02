package com.javabasic.buoi8.oop;

public class Engineer extends Employee {

    public Engineer(String name, String age, String gender, String address, String major, int level) {
        super(name, age, gender, address);
        this.major = major;
    }

    private String major;
    private int level;
    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
