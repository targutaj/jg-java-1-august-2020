package com.javaguru.student_igors_gergeleziu.lesson_3.level_6.task_25;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Circle {
    public double radius;

    public double calculateArea(double radius){
     return Math.PI*Math.pow(radius, 2);
    }
}
