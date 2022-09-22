package com.bridgelab;

public class AddPartTime {
    public static final int IS_FULL_TIME = 0;
    public static final int IS_PART_TIME = 1;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;


        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Fulltime");
        else
            System.out.println("Employee is Parttime");

        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else if (empCheck == IS_PART_TIME)
            empHrs = 4;

        empWage = empHrs * EMPLOYEE_WAGE_PER_HOUR;
        System.out.println("Employee wage is: " + empWage);
    }
}
