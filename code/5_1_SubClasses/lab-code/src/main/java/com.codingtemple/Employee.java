package com.codingtemple;

public class Employee extends Person {
   private int empID;

   //LAB TASK:  Create a default constructor for Employee
   public Employee(){
      super();
   }
   //LAB TASK:  Create an overloaded constructor for Employee taking in and setting the name and employee id
   public Employee(String name, int empID){
      super(name);
      this.empID = empID;
   }
   //LAB HINT:  Use the super() method to set the name for the parent method.

   //LAB TASK;  Create getters and setters for employee iD
   public int getEmpID(){
      return empID;
   }
   public void setEmpID(int empID){
      this.empID = empID;
   }
   //LAB TASK:  Override the toString() method in the parent class to add on the employee ID using a StringBuffer
   public String toString(){
      StringBuffer sb = new StringBuffer("Employee Name: " + this.getName() + "\n");
      sb.append("Employee ID: ").append(getEmpID());
      return sb.toString();
   }
}
