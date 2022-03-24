package com.bl.empwage;

public class EmpWageComputation extends UC9 {

	int totalWage;
	String nameOfCompany;

	EmpWageComputation(String name, int workDays, int workHours, int wage) {
		super(workDays, workHours, wage);
		this.nameOfCompany = name;
	}
	void calcTotalWage(){
		while (this.totalDays != this.MAX_WORKING_DAYS && this.totalHrs < this.MAX_WORKING_HRS) {
			this.totalDays++;
			int empCheck = empChoice();
			this.setTotalHrs(empCheck);
		}
		this.totalWage = calSalary();
		System.out.println(this.nameOfCompany +" - Days Worked: " +this.totalDays);
		System.out.println(this.nameOfCompany +" - Hours Worked: " + this.totalHrs);
		System.out.println(this.nameOfCompany +" - Total wage earned: " + this.totalWage);
		System.out.println("\n");
	}

	public static void main(String[] args) {
		EmpWageComputation company1 = new EmpWageComputation("HCL" ,25, 110,23);
		EmpWageComputation company2 = new EmpWageComputation("TCS" ,22, 100,28);

		company1.calcTotalWage();
		company2.calcTotalWage();

	}
}
