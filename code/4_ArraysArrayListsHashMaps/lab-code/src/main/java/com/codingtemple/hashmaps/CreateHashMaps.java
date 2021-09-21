package com.codingtemple.hashmaps;

import java.util.HashMap;
//LAB TASK:  In the Driver main

//LAB HINT:  Remember Access Modifiers
class CreateHashMaps {
   private HashMap<String, String> hashMap;

   private String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
   private String[] abbreviations = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};

   //LAB TASK:  Set the hashMap in the default constructor
   //LAB NOTE:  Use the buildHashMap method created below to set the value.
   public CreateHashMaps() {
      this.hashMap = buildHashMap();
   }

   //LAB TASK:  Add logic to build a hash map, have the states be the key and the abbreviations be the values.
   //LAB HINT:  hashMap.put(key, value);
   private HashMap<String, String> buildHashMap() {
      HashMap<String, String> hashMap = new HashMap<String, String>();

      return hashMap;
   }

   //LAB HINT:  This method uses a For Each loop
   public void printHashMap() {
      for (String key : hashMap.keySet()) {
         String value = hashMap.get(key).toString();
         System.out.println(key.toString() + " = " + value);
      }
   }

}
