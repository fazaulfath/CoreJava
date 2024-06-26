package com.fazaulfath.assignment2;

import java.util.Scanner;

public class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    /**
     * Accepts details of the sales employee.
     */
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();

        System.out.print("Enter phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        salesAmount = scanner.nextDouble();

        scanner.close();
    }

    /**
     * Calculates and returns the commission based on the sales amount.
     *
     * @return the commission
     */
    public double calculateCommission() {
        double commission;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000 && salesAmount < 100000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }
        return commission;
    }

    public static void main(String[] args) {
        // Creating a Commission object and calling its methods
        Commission commissionEmployee = new Commission();
        commissionEmployee.acceptDetails();
        double commission = commissionEmployee.calculateCommission();
        System.out.println("Commission: " + commission);
    }
}
