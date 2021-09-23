package com.codingtemple;

class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jane Prentiss");
        Employee employee2 = new Employee("Jan Kilbride");

        employee1.setSalary(12000);
        employee2.setSalary(87000);

        employee1.setDescription("An alarming woman with a penchant for insects.");
        employee2.setDescription("A poor, poor astronaut.");

        employee1.printEmployeeData();
        employee2.printEmployeeData();
    }
   /*
   LAB TASK:  Create main method
   LAB NOTE:  if you simply type "main" and hit tab it will auto complete.
   Inside the main method.
   LAB TASK:  Create a reference to the employee class called employee, passing in a String variable for the name
   LAB NOTE:  Employee employee = new Employee(name);
   LAB TASK:  Set this employees salary using the setter method created in the Employee class
   LAB TASK:  Create a second reference to the employee class called newEmployee
   passing in an int and string variable for name and salary new Employee(salary, name)
   LAB TASK:  Print out both employees using the getter methods created in the employee class
   LAB TASK:  Change the salary for both the employees created.
   LAB TASK:  Print out both employees using the getter methods created in the employee class
   BONUS:  Add some additional text for descriptions.
   */


}
