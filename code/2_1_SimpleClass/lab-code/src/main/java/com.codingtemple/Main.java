package com.codingtemple;

class Main {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();


        employee1.setName("Gerard Keas");
        employee1.setSalary(23000);

        employee2.setName("Mary Keas");
        employee2.setSalary(65000);
        employee1.printEmployeeData();
        employee2.printEmployeeData();
    }
   //LAB TASK:  Create main method
   //LAB NOTE:  if you simply type "main" and hit tab it will auto complete.

   //Inside the main method.
      //LAB TASK:  Create an instance of the Employee class and save the reference in a variable

      //LAB TASK:  Set the employees Name and Salary using the employee class reference

      //LAB TASK:  Print out the employees name and salary
      //EX:  Jim makes $30000
}