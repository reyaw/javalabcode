package com.codingtemple.arrays;

import java.util.Scanner;

//LAB HINT:  Remember Access Modifiers
public class CreateArray {
   private int size;
   private String[] array;

   //LAB TASK:  Using the CreateArray constructor add logic to set the size, add values too, and set the array it self.
   public CreateArray(int newSize) {
      setSize(newSize);
      buildArray();
   }

   public CreateArray() {
      setSize();
      buildArray();
   }

   //LAB NOTE:  This method asks the user for an input value and returns the value as a String.
   private void buildArray() {
      Scanner scanner = new Scanner(System.in);
      for(int i = 0; i < size; i++) {
         System.out.println("Enter a String for element " + "> ");
         array[i] = scanner.nextLine();
      }
   }

   //LAB TASK:  Add logic to this array to print the array created by the constructor
   public void printArray() {
      for(int i = 0; i < size; i++) {
         System.out.println("Element " + i + ": " + array[i]);
      }
   }

   //LAB TASK:  Overload the setSize method to contain logic found in the Driver class
   //LAB HINT:  Keep in mind OOP best practices
   public void setSize(int newSize) { this.size = newSize; };

   public void setSize(){
      Scanner scanner = new Scanner(System.in);
      String sizeString;
      do {
         System.out.println("Enter a size for the array " + "> ");
         sizeString = scanner.nextLine();
      } while(!(sizeString.matches("[0-9]+") && sizeString.length() > 0));
      this.size = Integer.parseInt(sizeString);
      array = new String[this.size];
   }

   public String[] getArray() {
      return array;
   }

   public void setArray(String[] array) {
      this.array = array;
   }
}
