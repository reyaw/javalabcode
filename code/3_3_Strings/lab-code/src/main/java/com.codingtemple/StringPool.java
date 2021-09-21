package com.codingtemple;

public class StringPool {
    public static void main(String[] args) {
        String first = "Temple";
        String second = "Temple";

        String third = new String("Temple");
        String forth = "Templ";

        String fifth = forth + "e";

        System.out.println(first == second);
        System.out.println(first.equals(second));

        System.out.println();

        System.out.println(first == third);
        System.out.println(first.equals(third));

        System.out.println();

        System.out.println(first == fifth);
        System.out.println(first.equals(fifth));
    }
}
