package com.javabasic.buoi7;

public class Engineer extends Employee{

    public Engineer(String name, String age, String gender, String address, String major, int level) {
        super(name, age, gender, address);
        this.major = major;
    }

    private String major;
    private int level;

    public void inputInfo() {
        super.inputInfo();
        System.out.println("Enter empoyee's major: ");
        this.setAddress(scanner.nextLine());
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("major: " + this.major);
    }
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
