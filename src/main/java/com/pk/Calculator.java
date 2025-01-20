package com.pk;

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
        return scanner.nextInt();
    }

    public double[] getNumber(Scanner scanner) {
        double numbers[] = new double[2];
        System.out.println("Enter the first number : ");
        numbers[0] = scanner.nextInt();

        System.out.println("Enter the second number : ");
        numbers[1] = scanner.nextInt();

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
