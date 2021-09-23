package com.codingtemple;

public class Looping {
   public static void main(String[] args) {
      /*
      * LAB TASK:
      * Write a for loop, while loop, & do while loop, in THIS main.
      * Loop from 0 to less than 10.
      * Within the loop, print out the value of your counter.
      *
      * */
      for(int i = 0; i < 10; i++){
         System.out.println(i);
      }

      int j = 0;
      while(j < 10){
         System.out.println(j);
         j++;
      }

      int k = 0;
      do {
         System.out.println(k);
         k++;
      }
      while (k < 10);

   }
}
