import java.util.ArrayList;
interface UC14 {
	void showInfo(Company company);
	void addCompany(Company company);
}
public class EmpWageBuilder implements UC14  {

	static ArrayList<Company> companyList=new ArrayList<Company>();
	public void showInfo(Company company) {
		System.out.println("Company name: "+company.name);
		System.out.println("Total Wage :"+company.monthlyWage);
	}

	public void addCompany(Company company) {
		for(Company element:companyList) {
			if(element.name.equals(company.name)){
				companyList.remove(element);
				break;
			}
		}
		companyList.add(company);

	}
	void showMonthlyWage(String name) {
		int condition=0;
		for(Company elements:companyList) {
			if(elements.name.equals(name)) {
				System.out.println("The total monthly wage of the company is Rs."+elements.monthlyWage);
				for(Company element:companyList) {
					if(element.name.equals(name)) {
						System.out.println("The total monthly wage of the company is Rs."+element.monthlyWage);
						condition=1;
						break;
					}

				}
				if(condition==0) {
					System.out.println("Company is not listed in the database");
				}
			}	 
		}
	}
}
