package com.Assignment;


import java.util.Random;

//Add Part time
//Employee & Wage
//- Assume Part time Hour is 8
public class EmpType {

// There is probability of 1:3 if the employee is part-time, full-time or absent,Hence considering:-
    // 0-means absent
    // 1-means full-time
    // 2-means part-time
    public static void main(String[] args) {
        int empCheck = (int) Math.round(Math.random() * 10) % 3;
        System.out.println(empCheck);
        int PartTimeWrkHrs = 4;
        int FullTimeWrkHrs = 8;
        if (empCheck == 1) {
            int wage = (FullTimeWrkHrs * 20);
            System.out.println("Emp working Hours are: " + FullTimeWrkHrs);
            System.out.println("Wage for Full time emp: " + wage);
        } else if (empCheck == 2) {
            int wage = (PartTimeWrkHrs * 20);
            System.out.println("Emp working Hours are: " + PartTimeWrkHrs);
            System.out.println("Wage for Part time emp: " + wage);
        } else {
            System.out.println("Employee is absent");
        }
    }
}

