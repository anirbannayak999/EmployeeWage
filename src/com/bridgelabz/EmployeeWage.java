package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args)
    {int WAGE_PER_HR = 20;
        int FullDayHours = 0;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(employeeCheck);
        if (employeeCheck == 1) {
            System.out.println("Employee is Present");
            FullDayHours = 8;
        } else {
            System.out.println("Employee is Absent");
        }
        int wage = FullDayHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);

        }
    }
