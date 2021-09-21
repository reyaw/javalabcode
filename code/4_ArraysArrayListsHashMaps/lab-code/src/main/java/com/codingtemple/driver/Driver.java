package com.codingtemple.driver;

import com.codingtemple.arrays.CreateArray;

import java.util.Scanner;

/*
 * LAB TASK:  Your first task will rework the logic below for a more Object Oriented Version.
 * You will be using the idea of encapsulation heavily.
 *
 * LAB:  4_1 - Arrays will only work in the CreateArray class and Driver Class
 * LAB:  4_2 - ArrayLists will only work in the CreateArrayLists and Driver Class
 * LAB:  4_3 - HashMaps will only be working in the CreateHashMaps
 * */

//LAB HINT:  Remember Access Modifiers
class Driver {
    public static void main(String[] args) {
        //LAB TASK:  Get this logic to work
        String[] string = new String[2];



        for (int i = 0; i < string.length; i++){
            string[i] = "value";
        }
//      LAB:  4_1
      CreateArray createArray = new CreateArray();
      createArray.printArray();
//
//      LAB:  4_2
//      CreateArrayList arrayList = new CreateArrayList();
//      arrayList.printArrayList();
//
//      LAB:  4_3
//      CreateHashMaps hashMaps = new CreateHashMaps();
//      hashMaps.printHashMap();

            //LAB NOTE:  Replace this logic with the above logic
            int size = userInputInteger();
        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            String element = userInputString();
            array[i] = element;
        }

        printArray(array);
    }


    //LAB TASK:  Relocate this logic inside the CreateArray Class, setSize method.
    //LAB HINT:  More instructions in the CreateArray Class
    private static int userInputInteger() {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Many cells should your array have? [ENTER INT (1:100)] > ");
        size = scanner.nextInt();

        while (size <= 0 || size > 100) {
            System.out.println("[Enter Value Between 1:100] > ");
            size = scanner.nextInt();
        }

        return size;
    }

    private static String userInputString() {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Enter a String element > ");
        string = scanner.nextLine();

        return string;
    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
