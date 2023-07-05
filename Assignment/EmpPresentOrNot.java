package com.Assignment;

import java.util.Random;

//Check Employee is
//Present or Absent
//- Use ((RANDOM)) for Attendance
//Check
public class EmpPresentOrNot {

    //Probability of employee present or absent is 50%
    // 1 means emp present
    // 0 means emp absent

    public static void main(String[] args) {
        int empCheck = (int) Math.round(Math.random() * 10) % 2;
        System.out.println(empCheck);

        if(empCheck==1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employees is absent");
        }

    }
}
