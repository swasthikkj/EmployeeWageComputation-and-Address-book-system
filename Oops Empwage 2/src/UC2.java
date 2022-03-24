import java.util.Random;
public class UC2 {
	static int random() {
		Random random = new Random();
		int i = random.nextInt(2)+1;
		return i;
	}

	static String attendence() {
		String attendence;
		if (random == 1) {
			attendence = "present";
		}
		else   {
			attendence = "absent";
		}
		return attendence;
	}

	static int hours() {
		int empHours;
		if (random == 1) {
			empHours = 8;
		}
		else {
			empHours = 0;
		}
		return empHours;
	}

	static int total_wage() {
		int Total_Wage = hours()*wage_per_hour;
		return Total_Wage;
	}

	public static final int random = random();
	public static int wage_per_hour = 20;
	public static void main(String[] args){
		System.out.println("Employee is "+attendence());
		System.out.println("The Total Wage of employee is "+total_wage());
	}
}
