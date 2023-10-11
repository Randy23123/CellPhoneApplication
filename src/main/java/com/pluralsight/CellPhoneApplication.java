package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whats your serial number? ");
        phone.setSerialNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Whats your phones model? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who's your carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is your phone number? ");
        phone.setPhoneNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Who's the owner? ");
        phone.setOwner(scanner.nextLine());

        System.out.println("Serial Number: " + phone.getSerialNumber() + "\nModel: " + phone.getModel() + "\nCarrier:" + phone.getCarrier() + "\nPhone Number: " + phone.getPhoneNumber() + "\nOwner: " + phone.getOwner());

    }
}
