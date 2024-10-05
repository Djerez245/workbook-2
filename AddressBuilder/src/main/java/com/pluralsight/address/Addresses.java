package com.pluralsight.address;

import java.util.Scanner;

public class Addresses {
   private String fullName;
   private String streetName;
   private String city;
   private String state;
   private int zip;
   private String shipStreet;
   private String shipCity;
   private String shipState;
   private int shipZip;

    public Addresses(String fullName, String streetName, String city, String state, int zip,
                     String shipStreet, String shipCity, String shipState, int shipZip) {
        this.fullName = fullName;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shipStreet = shipStreet;
        this.shipCity = shipCity;
        this.shipState = shipState;
        this.shipZip = shipZip;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getShipStreet() {
        return shipStreet;
    }
    public void setShipStreet(String shipStreet) {
        this.shipStreet = shipStreet;
    }
    public String getShipCity() {
        return shipCity;
    }
    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }
    public String getShipState() {
        return shipState;
    }
    public void setShipState(String shipState) {
        this.shipState = shipState;
    }
    public int getShipZip() {
        return shipZip;
    }
    public void setShipZip(int shipZip) {
        this.shipZip = shipZip;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + fullName). append("\n\n");
        sb.append("Billing Address:").append("\n\n");
        sb.append(streetName).append("\n");
        sb.append(city).append(", ").append(state).append(", ").append(zip).append("\n\n");
        sb.append("Shipping Address:").append("\n");
        sb.append(shipStreet).append("\n");
        sb.append(shipCity).append(",").append(shipState).append(", ").append(shipZip);
        return sb.toString(); }


        public static void main(String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please provide the following information: ");

            System.out.println("Full name:  ");
            String fullName = scanner.nextLine();
            System.out.println("billing street:  ");
            String streetName = scanner.nextLine();
            System.out.println("billing city:   ");
            String city = scanner.nextLine();
            System.out.println("billing state:   ");
            String state = scanner.nextLine();
            System.out.println("billing zip:   ");
            int zip = scanner.nextInt();
            scanner.nextLine();
            System.out.println("shipping street:    ");
            String shipStreet = scanner.nextLine();
            System.out.println("shipping city:    ");
            String shipCity= scanner.nextLine();
            System.out.println("shipping state:    ");
            String shipState = scanner.nextLine();
            System.out.println("shipping zip:   ");
            int shipZip = scanner.nextInt();

            Addresses fullAddress  = new Addresses(fullName, streetName, city, state, zip, shipStreet, shipCity, shipState, shipZip);
            System.out.println(fullAddress);




        }

}




