package com.codingtemple.arrays;

import java.util.Scanner;

//LAB HINT:  Remember Access Modifiers
public class CreateArray {
   private int size;
   private String[] array;

   //LAB TASK:  Using the CreateArray constructor add logic to set the size, add values too, and set the array it self.
   public CreateArray() {

   }

   //LAB NOTE:  This method asks the user for an input value and returns the value as a String.
   private String buildArray() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a String for element " + "> ");
      return scanner.nextLine();
   }

   //LAB TASK:  Add logic to this array to print the array created by the constructor
   public void printArray() {

   }

   //LAB TASK:  Overload the setSize method to contain logic found in the Driver class
   //LAB HINT:  Keep in mind OOP best practices
   public void setSize() { }

   public String[] getArray() {
      return array;
   }

   public void setArray(String[] array) {
      this.array = array;
   }
}
