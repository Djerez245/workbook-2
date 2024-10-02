package com.pluralsight;

public class StringsandLoops {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.toLowerCase());

        //hard way by doing repetition
        System.out.println("milk");
        System.out.println("cereal");
        System.out.println("chips");
        System.out.println("salsa");
        System.out.println("queso");
        System.out.println("cream cheese");
        System.out.println("bagels");
        System.out.println("guac");
        System.out.println("bread");
        System.out.println("butter");

        //cleaner way to present the list you can also use this type of for loop **for (int i = 0; i < list.length; i ++)**
        String[] list = {"milk", "cereal", "chips", "salsa", "queso", "cream cheese", "bagels", "guac", "bread", "butter"};
        for (String string : list) {
            System.out.println(string);
        }





    }
}
