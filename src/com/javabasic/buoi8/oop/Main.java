package com.javabasic.buoi8.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();
        System.out.println("Enter number of Employee: ");
        int number = scanner.nextInt();
        for (int i = 0; i< number; i++) {
       //     Employee employee = EmployeeManagement.inputInfo();
            Engineer engineer = (Engineer) EmployeeManagement.inputInfo();
            employeeList.add(engineer);
        }
        for (Employee e: employeeList) {
            EmployeeManagement.showInfo(e);
        }

    }
}
