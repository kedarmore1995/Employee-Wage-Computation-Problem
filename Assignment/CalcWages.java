package com.Assignment;

public class CalcWages {
    public static final int partTimeEmp = 1;
    public static final int fullTimeEmp = 2;
    public static final int wagePerHr = 20;
    public static final int Max_Working_days = 20;
    public static final int max_hrs_in_mnth=100;

    public static void main(String[] args) {


        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while ((totalWorkingDays < Max_Working_days) && (totalWorkingDays < max_hrs_in_mnth)) {
            totalWorkingDays++;
            int empCheck = (int) Math.round(Math.random() * 10) % 3;
            switch (empCheck) {
                case partTimeEmp:
                    empHrs = 4;
                    break;
                case fullTimeEmp:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("day#: " + totalWorkingDays + "      Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
