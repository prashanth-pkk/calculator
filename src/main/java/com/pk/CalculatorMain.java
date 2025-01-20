package com.pk;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            calculator.displayMenu();
            int choice = calculator.getUserChoice(scanner);

            if (choice == 0) {
                System.out.println("Exiting the calculator. Good bye!");
                break;
            }
            double[] numbers = calculator.getNumbersWithValidation(scanner,choice);
            double num1 = numbers[0];
            double num2 = numbers[1];

            calculator.performOperations(choice, num1, num2);

            System.out.println("Do you want to perform other calculation ? (yes/no)");
            String conChoice = scanner.next();
            if (conChoice.equalsIgnoreCase("no")) {
                System.out.println("Exiting the calculator, Good bye!");
                break;
            }
        }
        scanner.close();
    }
}
