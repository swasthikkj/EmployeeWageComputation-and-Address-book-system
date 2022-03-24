import java.util.Random;

public class UC8 {

	static int random(){
		Random random = new Random();
		int i = random.nextInt(3)+1;
		return i;
	}

	static int days(){
		int emphrs=0;
		int days =0;
		while (emphrs <= no_of_hours-1 && days <= no_of_day-1) {
			switch (random()) {
			case 1:
				emphrs = emphrs + no_of_dayhours;
				days= days +1;
				break;
			case 2:
				emphrs = emphrs + no_of_part_time_hours;
				break;
			default:
				break;
			}
		}
		return days;
	}

	static int total_wage(){
		int total_wage = no_of_hours*wage_per_hour;
		return total_wage;
	}
	
	public static final int random = random();
	public static final int wage_per_hour = 200;
	public static final int no_of_hours = 150;
	public static final int no_of_day = 26;
	public static final int no_of_dayhours = 7;
	public static final int no_of_part_time_hours = 3;
	public static void main(String[] args) {

		System.out.println("Company 1 Wage Calucultions");
		System.out.println();
		System.out.println("Number of hours employee Worked :"+no_of_hours);
		System.out.println("The total wage of employee is "+total_wage());
		System.out.println("Number of days Employee Worked : "+days());

		Employee_wage_Company obj = new Employee_wage_Company();
		System.out.println();

		System.out.println("Company 2 Wage Calucultions");
		System.out.println();
		System.out.println("Number of hours employee Worked :"+obj.no_of_hours);
		System.out.println("The total wage of employee is "+obj.total_wage());
		System.out.println("Number of days Employee Worked : "+obj.days());

	}
}

class Employee_wage_Company extends UC8{

	static int random(){
		Random random = new Random();
		int i = random.nextInt(3)+1;
		return i;
	}

	static int days(){
		int emphrs = 1;
		int days = 1;
		while (emphrs <= no_of_hours && days <= no_of_day) {
			switch (random()) {
			case 1:
				emphrs = emphrs + no_of_dayhours;
				days = days +1;
				break;
			case 2:
				emphrs = emphrs + no_of_part_time_hours;
				break;
			default:
				break;
			}
		}
		return days;
	}

	static int total_wage(){
		int total_wage = no_of_hours*wage_per_hour;
		return total_wage;
	}

	public static final int random = random();
	public static int wage_per_hour = 100;
	public static final int no_of_hours = 200;
	public static final int no_of_day = 30;
	public static final int no_of_dayhours = 6;
	public static final int no_of_part_time_hours = 3;
}
