package com.bl.empwage;

public class UC9 {
	int WAGE;
	int MAX_WORKING_DAYS;
	int MAX_WORKING_HRS;
	int totalHrs = 0;
	int totalDays = 1;
	
	UC9(int workDays, int workHours, int wage){
		this.WAGE = wage;
		this.MAX_WORKING_DAYS = workDays;
		this.MAX_WORKING_HRS = workHours;
	}
	
	void setTotalHrs(int x){
		switch (x) {
		case 1 -> {
			if (this.totalHrs <= this.MAX_WORKING_HRS) {
				this.totalHrs += 8;
			}
		}
		case 2 -> {
			if (this.totalHrs <= this.MAX_WORKING_HRS) {
				this.totalHrs += 4;
			}
		}
		default -> { }
		}
	}
	
	int calSalary(){
		return WAGE * this.totalHrs;
	}
	
	static int empChoice(){
		return (int) Math.floor((Math.random() * 100) % 3);
	}

	public static void main(String[] args) {
		UC9 company1 = new UC9(25, 110,23);
		
		while (company1.totalDays != company1.MAX_WORKING_DAYS && company1.totalHrs < company1.MAX_WORKING_HRS) {
			company1.totalDays++;
			int empCheck = empChoice();
			company1.setTotalHrs(empCheck);
		}

		System.out.println("Total Working Days are " +company1.totalDays);
		System.out.println("Total Working Hours are " + company1.totalHrs);
		System.out.println("The total salary is " + company1.calSalary());
	}
}
