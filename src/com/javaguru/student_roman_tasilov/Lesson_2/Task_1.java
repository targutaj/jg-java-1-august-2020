package com.javaguru.student_roman_tasilov.Lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args) {
        System.out.println("Please enter first number (int): ");

        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();

        System.out.println("First number : "+ firstNumber);

        System.out.println("Please enter srcond number (int): ");

        int secondNumber = sc.nextInt();

        System.out.println("Second number : " + secondNumber);
        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Multiply result: " + multiplyResult);

        int divisionResult = secondNumber / firstNumber;

        System.out.println("Division result: " + divisionResult);

        int subtractionResult = secondNumber - firstNumber;

        System.out.println("Subtraction result: " + subtractionResult);

        int sumResult = multiplyResult + divisionResult + subtractionResult;

        System.out.println("Sum result: " + sumResult);

    }
}
