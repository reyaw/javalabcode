package com.codingtemple;

public class StringBuilders {
   public static void main(String[] args) {
      //LAB TASK: Create a new StringBuffer
      StringBuffer stringBuffer = new StringBuffer();

      //LAB TASK: Add a string to the buffer
      stringBuffer.append("String1");

      //LAB TASK: Add another string to the buffer
      stringBuffer.append("String2");

      //LAB TASK: Convert the buffer to a string
      String buffedString1 = stringBuffer.toString();
      //LAB TASK: Create a new StringBuffer, initialized with the string
      StringBuffer stringBuffer1 = new StringBuffer(buffedString1);
      //LAB TASK: Add another string to the new string buffer
      stringBuffer1.append("String3");
      //LAB TASK: Convert the new string buffer to a string
      String buffedString2 = stringBuffer1.toString();
      //LAB TASK: Print out the string
      System.out.println(buffedString2);
   }
}
