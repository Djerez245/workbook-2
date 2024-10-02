package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    private static String firstName;
    private static String middleName;
    private static String lastName;
    private static String suffix;

    public FullNameParser(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getSuffix(){
        return suffix;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFirstName()).append(" ");
        if (! getMiddleName().isEmpty()) { sb.append(getMiddleName()).append(" "); }
        if (! getLastName().isEmpty()) {sb.append(getLastName()).append(" ");}
        if (! getSuffix().isEmpty()) { sb.append(getSuffix()); }
        return sb.toString();
    }

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

        FullNameParser namechooser = new FullNameParser(firstName, middleName, lastName, suffix);
        System.out.println(namechooser);



    }
}
