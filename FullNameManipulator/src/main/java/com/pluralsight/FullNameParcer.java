package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParcer {

    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static String suffix;
    private static String fullName;

    public FullNameParcer() {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;

    }

    public static String getFirstName() {
        return firstName;
    }
    public static String getMiddleName() {
        return middleName;
    }
    public static String getLastName() {
        return lastName;
    }
    public static String getSuffix() {
        return suffix;
    }
    public static String getFullName() {
        return fullName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFullName().trim());
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner nameparse = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        fullName = nameparse.nextLine();

        String[] nameParts = fullName.split(Pattern.quote(" "));

        //if nameParts.length = 2 we only have the first and last name
        //if name parts =3 we have a middle name
        if (nameParts.length==2){
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Last name: " + nameParts[1]);
        }
        else if (nameParts.length==3){
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);
        }


    }
}
