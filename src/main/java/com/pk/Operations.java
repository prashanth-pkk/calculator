package com.pk;

public class Operations {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public double modulus(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: modulus by zero is not allowed");
        }
        return num1 % num2;
    }

    public double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public double sqrt(double num) {
        if (num < 0) {
            throw new ArithmeticException("Error: square root of negative number is not allowed");
        }
        return Math.sqrt(num);
    }
}
