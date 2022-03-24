import java.util.Random;
public class UC5 { 
	static int random() {
		Random random = new Random();
		int i = random.nextInt(1)+1;
		return i;
	}
	
	static String attendence() {
		String attendence;
		switch (random) {
		case 1:
			attendence = "present";
			break;
		default:
			attendence = "absent";
		}
		return attendence;
	}
	
	static int days() {
		while (days <= 19) {
			switch (random) {
			case 1:
				days++;
				break;
			default:
				break;
			}
		}
		return days;
	}

	static int Total_Wage() {
		int Total_Wage=0;
		Total_Wage = days() * wage_per_hour*emphrs;
		return Total_Wage;
	}

	public static final int random = random();
	public static int wage_per_hour = 20;    
	public static int emphrs = 8;
	static int days = 0;

	public static void main(String[] args) {
		System.out.println("No of days employee is present : "+days());
		System.out.println("The Total Wage of Employee is " +Total_Wage());
	}
}
