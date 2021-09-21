package com.codingtemple;

public class Person {
   // The name private instance field
   String name;

   public Person() {
   }

   public Person(String name) {
      super();

      // Calls the no-argument superclass constructor

      // Saves the name argument into the instance field
      this.name = name;

   }

   public boolean equals(Object other) {

      // If the other object is not a Person, return false
      if (!(other instanceof Person))
         return false;

      // Cast the other reference into a Person
      Person otherPerson = (Person) other;

      // Get the name of the other Person
      String otherName = otherPerson.getName();

      // If the other name is not null and it is equal (case insensitive)
      // to this Person's name, return true, otherwise return false
      return otherName != null && otherName.equalsIgnoreCase(this.name);

   }

   public String toString() {
      // return the name of the Person
      return name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
