package com.codingtemple;

import java.util.Locale;

public class StringFun {
   public static void main(String[] args) {
      String string1 = new String("Hello");
      String string2 = new String("Hello");
      String string3 = new String("How are you?");
      String string4 = string3;
//
//      string1.equals(string1);
//
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append("Hello");
      stringBuffer.append(" World");

//      System.out.println(stringBuffer);

      String str = stringBuffer.toString();

//      stringBuffer.append(stringBuffer.length() < 35 ? "Value to add" : );

      int x = 0;
      double y = (double) x;

//      System.out.println(y);

      //LAB TASK: Print out each string, along with their lengths
      System.out.println(string1 + " | Length: " +string1.length());
      System.out.println(string2 + " | Length: " +string2.length());
      System.out.println(string3 + " | Length: " +string3.length());
      System.out.println(string4 + " | Length: " +string4.length());

      //LAB TASK: If string1 "equal" string2, print saying so.  Else print saying so
      System.out.println("string1 " + ((string1.equals(string2)) ? "'equals' " : "does not 'equal' ") + "string2");
      //LAB TASK: If string 1 and 2 are "==" print saying so here. Else print saying so
      System.out.println("string1 " + ((string1 == string2) ? "== ": "!= ") + "string2");
      //LAB TASK: If string 3 and 4 are "equal" print saying so here. Else print saying so
      System.out.println("string3 " + ((string3.equals(string4)) ? "'equals'" : "does not 'equal'") + " string4");
      //LAB TASK: If string 3 and 4 are "==" print saying so here. Else print saying so
      System.out.println("string3 " + ((string3 == string4) ? "== ": "!= ") + "string4");

      //LAB TASK: Create upper case "copies" of string1 (upperString1) and string3 (upperString3).
      String upperString1 = string1.toUpperCase(Locale.ROOT);
      String upperString3 = string3.toUpperCase(Locale.ROOT);
      //LAB TASK: Print the uppercase copies
      System.out.println(upperString1);
      System.out.println(upperString3);
      //LAB TASK: If string 1 and upperString1 are case-insensitive-equal print saying so.  Else print saying so
      System.out.println("string1 " + (string1.equalsIgnoreCase(upperString1) ? "is " : "is not ") + "case-insensitive-equal to upperString1" );
      //Shows If string1 is case-insensitive-equal-to the new uppercase copy of string1, print
   }
}
