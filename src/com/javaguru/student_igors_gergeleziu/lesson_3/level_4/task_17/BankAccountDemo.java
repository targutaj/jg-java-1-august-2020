package com.javaguru.student_igors_gergeleziu.lesson_3.level_4.task_17;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Jack", "Daniels", 1500000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
