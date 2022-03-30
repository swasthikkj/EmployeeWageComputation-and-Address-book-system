package com.bl.empwage;

import java.util.Random;

import java.util.Scanner;

public class EmpWage {

	static final int FULL_DAY_HOUR = 8;
	static final int PART_DAY_HOUR = 4;
	static int days = 0;
	static int hours = 0;
	static int monthlyWage = 0;
	int days = 0;
	int hours = 0;
	int monthlyWage = 0;


	int checkAttendance(int randInt) {
		switch (randInt) {
		case 1:
			return FULL_DAY_HOUR;
		case 2:
			return PART_DAY_HOUR;
		default:
			return 0;
		}
	}
	int calculateWage(int randInt,Company company) {
		int dailyWage = 0;
		switch (randInt) {
		case 1:
			//System.out.println("Daily Wage of employee is :Rs." + FULL_DAY_HOUR * company.wagePerHour);
			dailyWage = FULL_DAY_HOUR * company.wagePerHour;
			return dailyWage;
		case 2:
			//System.out.println("Daily Wage of employee is :Rs." + PART_DAY_HOUR * company.wagePerHour);
			dailyWage = PART_DAY_HOUR * company.wagePerHour;
			return dailyWage;
		default:
			return dailyWage;
		}
	}
	int calculateMonthlyWage(EmpWage employee,Company company) {
		Random randomInt = new Random();
		while (days < company.workingDays && hours <= company.workingHoursMonthly) {
			int randInt = randomInt.nextInt(3);
			hours = hours + employee.checkAttendance(randInt);
			if (hours > company.workingHoursMonthly) {
				hours = company.workingHoursMonthly;
				monthlyWage = monthlyWage + employee.calculateWage(randInt,company) - company.wagePerHour * PART_DAY_HOUR;
				break;
			} 
			else {
				monthlyWage = monthlyWage + employee.calculateWage(randInt,company);
			}
			days += 1;
			if(employee.checkAttendance(randInt)==0) {
				days-=1;
			}
		}
		//System.out.println("The name of company is "+ company.name);
		//System.out.println("The monthly wage of the employee is Rs. " + monthlyWage);
		System.out.println("Total days the employee worked is " + days + " days");
		System.out.println("Total hours the employee Worked is " + hours + " hours");
		return monthlyWage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Employee wage computation program");

		EmpWage employee = new EmpWage();
		Company company=new Company();
		UC11 empWageBuilder=new UC11();

		System.out.println("Enter the name of the company :");
		String name=scan.nextLine();
		System.out.println("Enter wage per hour :");
		int wagePerHour=scan.nextInt();
		System.out.println("Enter the total working days: ");
		int workingDays=scan.nextInt();
		System.out.println("Enter total monthly working hours :");
		int workingHoursMonthly=scan.nextInt();

		company.setInfo(name, wagePerHour, workingDays, workingHoursMonthly);
		int monthlyWage =employee.calculateMonthlyWage(employee,company);
		company.companyMonthlyWage(monthlyWage);

		empWageBuilder.showInfo(company);
		empWageBuilder.addCompany(company);
	}
}
