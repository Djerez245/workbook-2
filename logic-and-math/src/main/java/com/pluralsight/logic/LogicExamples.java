package com.pluralsight.logic;

public class LogicExamples {

    public static void main(String[] args) {
        System.out.println("hello");


        // % between int numbers to get remainder
        double area = 10 / 3;
        double remainder = 10 % 3;

        // **cast** (double) next int presents it as double (see number in a different way
        area = (double) 10 / 3;

        System.out.println(area);
        System.out.println("remainder: " + remainder);

        // Arithmetic operators
        // +  -  *  /  %
        // Increment/decrement operators PREFIX AND POSTFIX VERSIONS
        // prefix adds one before the statement postfix adds after statement
        // ++ -- (add one or subtract one

        area = area + 1;
        System.out.println(area);

        area++;
        System.out.println(area);

        System.out.println(++area); //6.3

        System.out.println(++area + area++ + remainder++);

        System.out.println(area); //8.33
        System.out.println(remainder); //2

        float x = (float) remainder; // use cast to say it doesn't care that remainder is a double
        System.out.println(x); //

        float y = 7.99f;
        System.out.println(y);

        double z = 8.33f;
        System.out.println(z); //

        System.out.printf("%.2f\n", z); //%.2f stands for 2 int after decimal
        System.out.println(z);

        boolean amIDone = false;
        int counter = 0;
        do {
            System.out.println("talking..... words....");
            if (counter++ == 5) amIDone = true;
        } while (!amIDone);
        amIDone = true; //saying to make it print the line until told to stop

        counter = 0;
        while (counter != 5) {
            System.out.println("talking.... words...");
            counter++;
        }
        for (int i=0; i<5; i++) {
            System.out.println("Talking...");
        }
        if (counter > 0) {
            System.out.println("We talked about it");
        }

        }
    }
