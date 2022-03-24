import java.util.Random;
public class UC3 {
	static int random() {
		Random random = new Random();
		int i = random.nextInt(3)+1;
		return i;
	}
	static String attendence() {
		String attendence;
		if (random == 1) {
			attendence = "present";
		}
		else if (random == 2) {
			attendence = "Attended partime";
		}
		else {
			attendence = "absent";
		}
		return attendence;
	}
	
	static int hours() {
		int emphours;
		if (random == 1) {
			emphours = 8;
		}
		else if (random == 2) {
			emphours = 4;
		}
		else {
			emphours = 0;
		}
		return emphours;
	}

	static int total_wage() {
		int Total_Wage = hours()*wage_per_hour;
		return Total_Wage;
	}
	
	public static final int random = random();
	public static int wage_per_hour = 20;
	public static void main(String[] args) {
		System.out.println("Employee is "+attendence());
		System.out.println("The Total Wage of Employee is "+total_wage());
	}
}
