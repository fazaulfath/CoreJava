package com.fazaulfath.assignment4;

public class BankingSystem {
    public static void main(String[] args) {
        // Instantiate the BankAccount class with account number and initial balance
        BankAccount account = new BankAccount(123456, 1000.0);

        try {
            // Perform deposit operation and handle potential exceptions
            account.deposit(500.0);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            // Perform withdrawal operation and handle potential exceptions
            account.withdraw(2000.0);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }

        try {
            // Perform withdrawal operation and handle potential exceptions
            account.withdraw(300.0);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
