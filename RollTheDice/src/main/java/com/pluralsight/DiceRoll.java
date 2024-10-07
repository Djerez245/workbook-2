package com.pluralsight;

public class DiceRoll {

    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1, roll2;
        int twoCounter= 0, fourCounter = 0,sixCounter = 0, sevenCounter = 0;

        for (int i = 0; i < 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.printf( "Roll %d: %d - %d Sum: %d%n", (i + 1), roll1, roll2, sum);

            if (2 == sum) twoCounter++;
            if (4 == sum) fourCounter++;
            if (6 == sum) sixCounter++;
            if (7 == sum) sevenCounter++;

            System.out.println("\nRESULTS\n");
            System.out.println("Number of times 2 was rolled: " + twoCounter);
            System.out.println("number of times 4 was rolled: " + fourCounter);
            System.out.println("number of times 6 was rolled: " + sixCounter);
            System.out.println("number of times 7 was rolled: " + sevenCounter);


        }


    }
}
