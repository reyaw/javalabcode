package com.codingtemple;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
   public static void main(String[] args) {
//      ListSorter listSorter = new ListSorter();

      //LAB 1.1
      HelloWorld();

      //LAB 1.2
//      CubeNum();

      //LAB 1.3
//      ListSorter();

      //LAB 1.4
//      PrimeNum();
   }


   //LAB 1.1:  Call HelloWorld method in the main method.
   private static void HelloWorld(){
      System.out.print("Hello World!");
      System.out.print("Hello World!");
   }


   //LAB 1.2
   private static void CubeNum(){
      for(int i=0; i < 11; i++){
         System.out.println();
         //LAB NOTE:  Complete the code to perform the same as the python code.
      }
   }


   //LAB 1.3
   private static void ListSorter(){
       ArrayList<String> arrayList = new ArrayList<String>();
      //ArrayList<ArrayList> arrayLists = new ArrayList<ArrayList>();

      //LAB TASK:  Add the rest of the values to the list.
      //LAB NOTE:  use the .add() method.  Add VOLVO, FORD, WV, CHEVY, NISSAN
      arrayList.add("BMW");
      //LAB TASK:  Finish the code
      //LAB NOTE:  Use Collections.sort();

      System.out.println(arrayList);
   }


   //LAB 1.4
   private static void PrimeNum(){
      int num = 11;
      boolean flag = false;

      for (int i = 2; i <= num / 2; ++i) {

         //LAB TASK:  Complete the code

//         if () { }
      }

      //LAB TASK:  Complete the code
      //LAB NOTE:  '+' is used to combine values in a print statement.
         //EX:  println("Hello" + "World") = HelloWorld

      //if () { }
      //else { }
   }
}