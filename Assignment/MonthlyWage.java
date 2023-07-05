package com.Assignment;

//Calculating Wages
//for a Month
//- Assume 20 Working Day per Month
public class MonthlyWage {
    public static final int partTimeEmp = 1;
    public static final int fullTimeEmp = 2;
    public static final int wagePerHr = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;
        int TotalMonthlywage=0;
        int Working_days = 20;
        int empCheck = (int) Math.round(Math.random() * 10) % 3;
        switch (empCheck) {
            case partTimeEmp:
                empHrs = 4;
                System.out.println("partTimeEmp");
                break;
            case fullTimeEmp:
                empHrs = 8;
                System.out.println("fullTimeEmp");
                break;
            default:
                empHrs = 0;
                System.out.println("Absent");
            }
            empWage = wagePerHr * empHrs;
        TotalMonthlywage=empWage*Working_days;
        System.out.println("employee wage for 20 days :" + TotalMonthlywage);
    }
}
