package com.shubhamdeshkar;

import java.util.Scanner;

public class EmailApp {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int storageCapacity;
    private int defaultPasswordLength = 8;
    private String department;
    private String alternateEmail;

    // Constructor
    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL INITIALIZED FOR: " + this.firstName + " " + this.lastName);

        // Call a method asking for department
        this.department = setDepartment();
        System.out.println("DEPARTMENT INITIALIZED: " + this.department);

        // Call a method generating random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("YOUR PASSWORD IS: " + this.password);

        // Combine elements to generate email
        this.email = this.firstName.toLowerCase() + '.' + this.lastName.toLowerCase() + '@' + this.department.toLowerCase()
                + ".company.com";
        System.out.println("EMAIL: " + this.email);
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
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox storageCapacity
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }


    // Set alternateEmail
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    // Change password
    public void setPassword(String password) {
        this.password = password;
    }
}
