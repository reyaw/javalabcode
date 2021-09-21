package com.codingtemple;

import java.util.Scanner;

public class TreeBuilder {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int x;
      System.out.println("How big of a tree? [ENTER INT (1:100)] > ");
      x = scanner.nextInt();

      while (x < 3 || x > 100) {
         System.out.println("[Enter Value Between 3:100] > ");
         x = scanner.nextInt();
      }

      // 5

      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x - i; j++)
            System.out.print(" ");

         for (int k = 0; k < (2 * i + 1); k++)
            System.out.print("*");

         System.out.println();
      }

      for(int m=0; m< x/2; m++){
         for (int j=0; j<x; j++)
            System.out.print(" ");
         System.out.print("*\n");
      }

      /*
      * LAB TASK:
      * Create a Christmas tree.
      * Ex:
      User Input: 3

         *
        ***
       *****

      */

      //LAB HINT:  Use for loops

      /*
      * LAB TASK:
      * Add a trunk to the Christmas Tree
      * Trunk should be half the size of x
      *
      User Input: 3

         *
        ***
       *****
         *

      *
      * */
      //LAB HINT:
   }
}
