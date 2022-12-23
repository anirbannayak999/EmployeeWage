package com.bridgelabz;

public class EmployeeWage {
   static int dailywage=0;
   static int PART_TIME = 1;
    static int WAGE_PER_HR = 20;
    static int FULL_TIME = 2;
    static int FULL_DAY_HOURS=8;
    static final int WORKING_DAYS_PER_MONTH =20;
    static int PART_TIME_HOUR=4;

    public static void main(String[]args) {
    System.out.println("Welcome to employee wage");

    int daycount=1;
    int totalwage=0;

    while(daycount <= WORKING_DAYS_PER_MONTH) {

    int employeeCheck = (int) (Math.random()*3);
		switch (employeeCheck) {
            case FULL_TIME:    {
                    dailywage=WAGE_PER_HR * FULL_DAY_HOURS;
                totalwage += dailywage;
                System.out.println("Employee worked full time.");
        }

            case PART_TIME :    {
                dailywage = WAGE_PER_HR * PART_TIME_HOUR;
                totalwage += dailywage;
                System.out.println("Employee worked part time.");
            }
            default {

                System.out.println("Employee is absent.");
                System.out.println("wages of the employee"+dailywage);
            }daycount++;
        }



}
}
}