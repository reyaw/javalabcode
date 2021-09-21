package com.codingtemple;
/*
*   Enumeration contains information about the 50 states.
*
* */

public enum states {
   AL("Alabama","Montgomery"),
   AK("Alaska","Juneau"),
   AZ("Arizona","Phoenix"),
   AR("Arkansas","Little Rock"),
   CA("California","Sacramento"),
   CO("Colorado","Denver"),
   CT("Connecticut","Hartford"),
   DE("Delaware","Dover"),
   FL("Florida","Tallahassee"),
   GA("Georgia","Atlanta"),
   HI("Hawaii","Honolulu"),
   ID("Idaho","Boise"),
   IL("Illinois","Springfield"),
   IN("Indiana","Indianapolis"),
   IA("Iowa","Des Moines"),
   KS("Kansas","Topeka"),
   KY("Kentucky","Frankfort"),
   LA("Louisiana","Baton Rouge"),
   ME("Maine","Augusta"),
   MD("Maryland","Annapolis"),
   MA("Massachusetts","Boston"),
   MI("Michigan","Lansing"),
   MN("Minnesota","St. Paul"),
   MS("Mississippi","Jackson"),
   MO("Missouri","Jefferson City"),
   MT("Montana","Helena"),
   NE("Nebraska","Lincoln"),
   NV("Nevada","Carson City"),
   NH("New Hampshire","Concord"),
   NJ("New Jersey","Trenton"),
   NM("New Mexico","Santa Fe"),
   NY("New York","Albany"),
   NC("North Carolina","Raleigh"),
   ND("North Dakota","Bismarck"),
   OH("Ohio","Columbus"),
   OK("Oklahoma","Oklahoma City"),
   OR("Oregon","Salem"),
   PA("Pennsylvania","Harrisburg"),
   RI("Rhode Island","Providence"),
   SC("South Carolina","Columbia"),
   SD("South Dakota","Pierre"),
   TN("Tennessee","Nashville"),
   TX("Texas","Austin"),
   UT("Utah","Salt Lake City"),
   VT("Vermont","Montpelier"),
   VA("Virginia","Richmond"),
   WA("Washington","Olympia"),
   WV("West Virginia","Charleston"),
   WI("Wisconsin","Madison"),
   WY("Wyoming","Cheyenne");

   //define two private constants of type String, called stateName and stateCapital

   /*
      Create a constructor for this Enum that takes the stateName and stateCapital as String objects
      Set the value of the two constants to the values of these arguments
   */

   states(String stateName,String stateCapital){
      // HINT:  Assign values to private constants.
   }

   //Define two getter methods to return the values of stateName and stateCapitol
}
