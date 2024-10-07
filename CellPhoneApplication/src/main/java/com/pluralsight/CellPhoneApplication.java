package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static void main(String[] args) {

        CellPhone CellPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Serial Number?");
        int serialNumber = scanner.nextInt();
        CellPhone.setSerialNumber(serialNumber);
        scanner.nextLine();
        System.out.println("What model is your phone?");
        String model = scanner.nextLine();
        CellPhone.setModel(model);
        System.out.println("Who is your Carrier");
        String carrier = scanner.nextLine();
        CellPhone.setCarrier(carrier);
        System.out.println("What is your phone number?");
        String phoneNumber = scanner.nextLine();
        CellPhone.setPhoneNumber(phoneNumber);
        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        CellPhone.setOwner(owner);

        System.out.println("serial Number: " + CellPhone.getSerialNumber());
        System.out.println("Model: " + CellPhone.getModel());
        System.out.println("Carrier: " + CellPhone.getCarrier());
        System.out.println("Phone Number: "+ CellPhone.getPhoneNumber());
        System.out.println("Owner: " + CellPhone.getOwner());
    }

    public static void display(CellPhone phone){
        CellPhone dialPhone =new CellPhone();
        display(cellPhone1);
        display(cellPhone2);
    }
}

