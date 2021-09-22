package com.codingtemple;

//LAB TASK:  Create a class called Employee
    //LAB TASK:  Create 2 variables.
        //1. type int, and variable name as salary
        //2. type String, and variable name as name

class Employee {
    private int salary;
    private String name;

    public Employee(int newSalary, String newName) {
        salary = newSalary;
        name = newName;
    }

    public Employee(){}

    public void printEmployeeData(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}