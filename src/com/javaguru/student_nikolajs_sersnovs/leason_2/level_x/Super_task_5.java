package com.javaguru.student_nikolajs_sersnovs.leason_2.level_x;

import java.util.Scanner;

class Super_task_5 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number:");
        int firstNumber = in.nextInt();
        System.out.println("Input second number:");
        int secondNumber = in.nextInt();

        int Addition = firstNumber + secondNumber;
        // int Addition = firstNumber + secondNumber;
        int Subtraction = firstNumber - secondNumber;
        int Multiplication = firstNumber * secondNumber;
        int Division = firstNumber / secondNumber;

        System.out.println("Addition = " + Addition);
        System.out.println("Subtraction = " + Subtraction);
        System.out.println("Multiplication = " + Multiplication);
        System.out.println("Division = " + Division);
        /*
        System.out.println("Division = " + Division);
        System.out.println("Division = " + Division);
        System.out.println("Division = " + Division);
        */

    }
}

