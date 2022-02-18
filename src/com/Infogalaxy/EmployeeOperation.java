package com.Infogalaxy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeOperation {
    EmployeeData employeeData = new EmployeeData();
    Wages wages = new Wages();
    Scanner sc = new Scanner(System.in);

    public void getEmployeeData(){
        System.out.println("Enter the Employee Id:");
            employeeData.setEmployeeId(sc.nextInt());
            System.out.println("Enter the Employee Name:");
            employeeData.setEmployeeName(sc.next());
            System.out.println("Enter the Daily Wages:");
            wages.setDailyWages(sc.nextInt());
            System.out.println("Enter the Working Days:");
            wages.setWorkingdays(sc.nextInt());
            employeeData.setEmployeeSalary(wages.getDailyWages() * wages.getWorkingdays());

    }

    public void showEmployeeData()
    {

        System.out.println(employeeData.toString());
    }

    public static void main(String[] args) {
        EmployeeOperation employeeOperation = new EmployeeOperation();
        employeeOperation.getEmployeeData();
        employeeOperation.showEmployeeData();

    }
}
