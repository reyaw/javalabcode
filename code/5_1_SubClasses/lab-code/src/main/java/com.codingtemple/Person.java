package com.codingtemple;

public class Person {
   private String name;

   //LAB TASK:  Create Default Constructor
   public Person(){}
   //LAB TASK:  Create overloaded constructor, taking in and setting the name.
   public Person(String name){
      this.name = name;
   }
   //LAB TASK:  Create getters and setters for the name variable.
   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name = name;
   }

   public String toString(){
      return "Name: " + getName();
   }

}
