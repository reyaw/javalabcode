package com.codingtemple.arraylists;

//import com.codingtemple.driver.Driver;
import java.util.ArrayList;
import java.util.Scanner;

//LAB HINT:  Remember Access Modifiers
public class CreateArrayList {
   private ArrayList<String> arrayList;

   //LAB TASK:  Use the default constructor to set and build the arrayList in a 1 liner.
   //LAB NOTE:  Do not use a setter.
   public CreateArrayList(){
      arrayList = buildArrayList();
   }
   //LAB TASK:  Create logic for this method that builds an array list and returns it.
   //LAB EXTRA:  Make this dynamic for user input. (Use Scanners)
   private ArrayList<String> buildArrayList() {
      ArrayList<String> arrayList = new ArrayList<String>();
      Scanner scanner = new Scanner(System.in);
      String sizeString;

      do {
         System.out.println("Enter a size for the arraylist " + "> ");
         sizeString = scanner.nextLine();
      } while(!(sizeString.matches("[0-9]+") && sizeString.length() > 0));
      int size = Integer.parseInt(sizeString);

      for(int i=0; i < size; i++){
         System.out.println("Enter a string for element " + i + " > ");
         arrayList.add(scanner.nextLine());
      }
      //LAB HINT:  arrayList.add();
      return arrayList;
   }

   //LAB TASK:  Create logic for this method that prints out the array and returns nothing
   //LAB HINT:  .size() gives you the number of elements in the arrayList (Similar to length)
   public void printArrayList(){
         for(int i = 0; i <arrayList.size(); i++){
            System.out.println("Element " + i + ": " + arrayList.get(i));
         }
   }
}