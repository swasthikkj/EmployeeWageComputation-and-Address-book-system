import java.util.Random;

import java.util.Scanner;

public class EmpWageBuilder {

	static final int FULL_DAY_HOUR = 8;
	static final int PART_DAY_HOUR = 4;

	static int days = 0;
	static int hours = 0;
	static int monthlyWage = 0;

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

	int calculateWage(int randInt,UC10 company) {
		int dailyWage = 0;
		switch (randInt) {
		case 1:

			dailyWage = FULL_DAY_HOUR * company.wagePerHour;
			return dailyWage;
		case 2:

			dailyWage = PART_DAY_HOUR * company.wagePerHour;
			return dailyWage;
		default:
			return dailyWage;
		}
	}

	int calculateMonthlyWage(EmpWageComputation employee,EmpWageComputation company) {
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
			if(employee.checkAttendance(randInt) == 0) {
				days-=1;
			}
		}

		System.out.println("Total days the employee worked is " + days + " days");
		System.out.println("Total hours the employee Worked is " + hours + " hours");
		return monthlyWage;
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Employee wage computation program");

		EmpWageComputation employee = new EmpWageComputation();
		UC10 company=new UC10();
		EmpWageBuilder empWageBuilder=new EmpWageBuilder();
		System.out.println("Enter the name of the company :");

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
		empWageBuilder.totalWage(name, monthlyWage);
		empWageBuilder.showInfo();
		company.companyMonthlyWage(monthlyWage);

		empWageBuilder.showInfo(company);
		empWageBuilder.addCompany(company);
	}
}
