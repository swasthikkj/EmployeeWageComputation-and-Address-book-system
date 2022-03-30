package com.bl.empwage;

import java.util.ArrayList;

public class UC11 {

	interface collection{
		void showInfo(Company company);
		void addCompany(Company company);
	}
	public class UC11 implements collection  {

	 static ArrayList<Company> companyList = new ArrayList<Company>();

			public void showInfo(Company company) {
				 System.out.println("Company name: "+company.name);
				 System.out.println("Total Wage :"+company.monthlyWage);
			}

			public void addCompany(Company company) {
				 companyList.add(company);
	}

	 void showInfo(Company company) {
		 System.out.println("Company name: "+company.name);
		 System.out.println("Total Wage :"+company.monthlyWage);
	 }

	 void addCompany(Company company) {
		 companyList.add(company);
	 }
	}
}
