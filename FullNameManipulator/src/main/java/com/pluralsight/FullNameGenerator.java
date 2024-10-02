package com.pluralsight;

import java.util.Scanner;

        //define strings
public class FullNameGenerator {
    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static String suffix;

        //build constructor
    public FullNameGenerator(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

        //build getter
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

        // building to string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFirstName().trim()).append(" ");
        if (!getMiddleName().isEmpty()) {
            sb.append(getMiddleName().trim()).append(" ");
        }
        if (!getLastName().isEmpty()) {
            sb.append(getLastName().trim()).append(" ");
        }
        if (!getSuffix().isEmpty()) {
            sb.append(getSuffix().trim());
        }
        return sb.toString();
    }

        //user inputs
    public static void main(String[] args) {
        Scanner namescanner = new Scanner(System.in);

        System.out.println(" Enter Your First Name ");
        firstName = namescanner.nextLine();
        System.out.println(" Enter Your Middle Name ");
        middleName = namescanner.nextLine();
        System.out.println(" Enter Your Last Name ");
        lastName = namescanner.nextLine();
        System.out.println(" Enter your suffix ");
        suffix = namescanner.nextLine();

        //give results
        FullNameGenerator namechooser = new FullNameGenerator(firstName, middleName, lastName, suffix);
        System.out.println(namechooser);


    }
}
