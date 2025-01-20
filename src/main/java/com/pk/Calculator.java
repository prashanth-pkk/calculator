package com.pk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private Operations operations;

    public Calculator() {
        operations = new Operations();
    }

    public void displayMenu() {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    public int getUserChoice(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 4) {
            try {
                System.out.println("Enter your choice 0 is exit");
                choice = scanner.nextInt();
                if (choice < 0 || choice > 4) {
                    System.out.println("Invalid choice. Please select the valid operation");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter a number");
                scanner.next();
            }
        }
        return choice;
    }

    public double[] getNumbersWithValidation(Scanner scanner) {
        double numbers[] = new double[2];
        while (true) {
            try {

                System.out.println("Enter the first number : ");
                numbers[0] = scanner.nextInt();

                System.out.println("Enter the second number : ");
                numbers[1] = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input, please enter valid input");
                scanner.next();
            }
        }

        return numbers;
    }

    public void performOperations(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                System.out.println("The result of addition : " + operations.addition(num1, num2));
                break;
            case 2:
                System.out.println("The result of subtraction : " + operations.subtraction(num1, num2));
                break;
            case 3:
                System.out.println("The result of multiplication : " + operations.multiplication(num1, num2));
                break;
            case 4:
                System.out.println("The result of division : " + operations.division(num1, num2));
                break;
            default:
                System.out.println("Enter the valid operation choice ");
                break;
        }
    }
}
