package com.junitTesting.services;

public class CalculatorServices {

    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    public static int subtractTwoNumber(int a, int b) {
        return a - b;
    }

    public static int multiplyTwoNumber(int a, int b) {
        return a * b;
    }

    public static int divideTwoNumber(int a, int b) {
        return a / b;
    }


    public static int sumAnyNumber(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
