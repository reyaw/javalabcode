package com.codingtemple;

class Employee {
   //LAB TASK:  Create 2 global variables.
      //1. type int, access as private, and variable name as salary
      //2. type String, access as private, and variable name as name

   //LAB TASK:  Create an overloaded Employee constructor allowing 1 argument Name.
      //LAB TASK:  Set the name you provided to initialize the name variables above.

   //LAB TASK:  Create an overloaded Employee constructor allowing 2 arguments Name and Salary.
      //LAB TASK:  Set the values you provided to initialize the two variables above.

   //LAB TASK:  Generate Getters & Setters for name and salary

    private int salary;
    private String name;
    private String description;

    public Employee(int newSalary, String newName) {
        salary = newSalary;
        name = newName;
    }

    public Employee(String newName){
        name = newName;
    }
    public Employee(int newSalary){
        salary = newSalary;
    }

    public Employee(){}

    public void printEmployeeData(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Description: " + getDescription());
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setSalary(int newSalary) {
        salary = newSalary;
    }
    public void setDescription(String newDescription) {description = newDescription; }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public String getDescription() { return description; }
}
