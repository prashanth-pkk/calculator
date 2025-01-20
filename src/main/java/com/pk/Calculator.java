package com.pk;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private final Operations operations;
    private Stack<Double> memory;

    public Calculator() {
        operations = new Operations();
        memory = new Stack<>();
    }

    public void saveResultToMemory(double result){
        memory.push(result);
    }

    public double getResultFromMemory(){
        if(!memory.isEmpty()){
            return memory.peek();
        }else {
            System.out.println("No results in memory");
            return Double.NaN;
        }
    }

    public void displayMenu() {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Square Root");
        System.out.println("0. Exit");
    }

    public int getUserChoice(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 8) {
            try {
                System.out.println("Enter your choice 0 is exit");
                choice = scanner.nextInt();
                if (choice < 0 || choice > 8) {
                    System.out.println("Invalid choice. Please select the valid operation");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter a number");
                scanner.next();
            }
        }
        return choice;
    }

    public double[] getNumbersWithValidation(Scanner scanner, int choice) {
        double numbers[] = new double[2];
        if (choice == 7) {
            while (true) {
                try {
                    System.out.println("Enter the number ");
                    numbers[0] = scanner.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input, please enter valid input");
                    break;
                }
            }
        } else {
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
            case 5:
                try {
                    System.out.println("The result of modulus : " + operations.modulus(num1, num2));
                } catch (ArithmeticException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case 6:
                System.out.println("The result of " + num1 + " raised to the power of " + num2 + " : " + operations.power(num1, num2));
                break;
            case 7:
                System.out.println("The square root of " + num1 + " : " + operations.sqrt(num1));
                break;
            default:
                System.out.println("Enter the valid operation choice ");
                break;
        }
    }
}
