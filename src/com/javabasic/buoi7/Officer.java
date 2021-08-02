package com.javabasic.buoi7;

public class Officer extends Employee{
    public Officer(String name, String age, String gender, String address, String department) {
        super(name, age, gender, address);
        this.department = department;
    }

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
