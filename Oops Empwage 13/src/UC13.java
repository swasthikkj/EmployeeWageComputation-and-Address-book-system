
public class UC13 {
	String name;
	int wagePerHour;
	int workingDays;
	int workingHoursMonthly;
	int monthlyWage;
	int[] dailyWage=new int[20];
	void setInfo(String name,int wagePerHour,int workingDays,int workingHoursMonthly) {
		this.name=name;
		this.wagePerHour=wagePerHour;
		this.workingDays=workingDays;
		this.workingHoursMonthly=workingHoursMonthly;

	}

	void companyMonthlyWage(int monthlyWage) {
		this.monthlyWage=monthlyWage;
	}

	void dailyWage(int dailyWage,int index) {
		this.dailyWage[index]=dailyWage;
	}
}
