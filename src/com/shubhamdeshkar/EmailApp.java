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
    }

    // Ask for department
    public String setDepartment() {
        System.out.println("ENTER DEPARTMENT:");
        System.out.println("1 for Sales\n2 for Development\n3 for Accounting");

        Scanner scanner = new Scanner(System.in);
        
    }

    // Generate a random Password

    // Set the mailbox storageCapacity

    // Set alternateEmail

    // Change password
}
