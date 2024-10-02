package com.pluralsight;

public class DonutShop {
    public static void main(String[] args) {

        Donut d = new Donut("Cherry Topper", 499, 3.99);


        Donut d2 = new Donut("Chocolate Fudge", 600, 1.99);


        System.out.println(d);
        printDonutAsCSV(d);
        printDonut(d);
        //System.out.println(d2);
    }

    public static void printDonut(Donut d) {
        System.out.println(d.getDescription());
        System.out.printf("Which cost $%.2f\n", d.getPrice());
    }

    public static void printDonutAsCSV(Donut d){
        System.out.print(d.getDescription());
        System.out.print(",");
        System.out.print(d.getCalories());
        System.out.print(",");
        System.out.println(d.getPrice());
    }

}

