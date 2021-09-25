package com.codingtemple;

public class Test {
   public static void main(String[] args) {
      //LAB TASK:  Create a Person object and instantiate it using a name.
      Person person = new Person("Agatha");
      //LAB TASK:  Create an Employee object and instantiate it using a name and an employee id.
      Employee employee = new Employee("Gerard", 166);

      //LAB TASK:  Print out both the Person object with the .toString() method
      System.out.println(person.toString());
      //LAB TASK:  Print out both the Employee object with the .toString() method
      System.out.println(employee.toString());
   }
}
