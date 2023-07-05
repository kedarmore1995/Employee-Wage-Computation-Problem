package com.Assignment;

import java.util.Calendar;
import java.util.Random;

public class EmpDailyWage {

    public static void main(String[] args) {
        int empCheck = (int) Math.round(Math.random() * 10) % 2;
        System.out.println(empCheck);

        int FullTimeWrkHrs = 8;
        int wagePerHour = 20;
        if (empCheck == 1) {
            int dailyWage = FullTimeWrkHrs * 20;
            System.out.println("Emp worked for: " + FullTimeWrkHrs + "Hrs");
            System.out.println("Emp Daily wage: " + dailyWage);
        } else {
            System.out.println("Employees is absent");


        }
    }
}