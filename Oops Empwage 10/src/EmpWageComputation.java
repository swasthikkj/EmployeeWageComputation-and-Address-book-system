import java.util.ArrayList;
public class EmpWageComputation {
	String name;
	int monthlyWage;

	void totalWage(String name,int monthlyWage) {
		this.name=name;
		this.monthlyWage=monthlyWage;
	}
	
	static ArrayList<UC10> companyList=new ArrayList<UC10>();

	void showInfo(UC10 company) {
		System.out.println("Company name: "+company.name);
		System.out.println("Total Wage :"+company.monthlyWage);
	}
	
	void showInfo() {
		System.out.println("Company name: "+name);
		System.out.println("Total Wage :"+monthlyWage);
	}
	
	void addCompany(UC10 company) {
		companyList.add(company);
	}
}