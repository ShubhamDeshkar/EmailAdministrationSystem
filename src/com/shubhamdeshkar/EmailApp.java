package com.shubhamdeshkar;

import java.util.Scanner;

public class EmailApp {

    private String firstName;
    private String lastName;
    private String password;
    private int storageCapacity;
    private String department;
    private String altenateEmail;

    // Constructor
    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL INITIALIZED FOR: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("DEPARTMENT INITIALIZED: " + this.department);
    }

    // Ask for department
    public String setDepartment() {
        System.out.println("ENTER DEPARTMENT:");
        System.out.println("1 for Sales\n2 for Development\n3 for Accounting");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1: return "Sales";

            case 2: return "Development";

            case 3: return "Accounting";

            default: return "None";
        }
    }

    // Generate a random Password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%-";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox storageCapacity

    // Set alternateEmail

    // Change password
}
