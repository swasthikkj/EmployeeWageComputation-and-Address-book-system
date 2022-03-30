
public class UC10 {

	String name;
	int wagePerHour;
	int workingDays;
	int workingHoursMonthly;
	int monthlyWage;
	void setInfo(String name,int wagePerHour,int workingDays,int workingHoursMonthly) {
		this.name=name;
		this.wagePerHour=wagePerHour;
		this.workingDays=workingDays;
		this.workingHoursMonthly=workingHoursMonthly;
	}

	void companyMonthlyWage(int monthlyWage) {
		this.monthlyWage=monthlyWage;
	}
}