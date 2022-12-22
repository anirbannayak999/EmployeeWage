package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[]args)
        { System.out.println("Welcome to employee wage");
    int FULL_TIME = 2;
    int PART_TIME = 1;
    int WAGE_PER_HR = 20;
    int employeeCheck = (int) (Math.random()*3);
    int empHrs;
		if(employeeCheck == FULL_TIME) {
        System.out.println("Employee worked full time.");
        empHrs = 8;
    }else if (employeeCheck == PART_TIME) {
        System.out.println("Employee worked part time.");
        empHrs = 4;
    }else {
        System.out.println("Employee is absent.");
        empHrs = 0;
    }
    int salary = WAGE_PER_HR * empHrs;
		System.out.println("Salary of the employee is : " + salary);


}
}