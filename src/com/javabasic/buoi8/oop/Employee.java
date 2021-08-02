package com.javabasic.buoi8.oop;

import java.util.Scanner;

public class Employee {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private String dayOfBirth;
    private String gender;
    private String address;

    public Employee() {}
    public Employee(String name, String dayOfBirth, String gender, String address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
