package com.Infogalaxy;

public class EmployeeData {

    int employeeId;
    String employeeName;
    double employeeSalary;

    public EmployeeData(){

    }

    public EmployeeData(int employeeId,String employeeName, double employeeSalary){
        this.employeeId =employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }
    @Override
    public String toString(){
        return "EmployeeData{"+
                "employeeId=" + employeeId +
                ", employeeName='"+employeeName+
                ", employeeSalary="+ employeeSalary+
                '}';
    }
}
