import java.util.Random;
public class UC7 {
	static int random() {
		Random random = new Random();
		int i = random.nextInt(3)+1;
		return i;
	}
	
	static int hours() {
		int emphours = 0;
		int days = 0;
		while (emphours <= 99 && days <= 20) {
			switch (random()) {
			case 1:
				emphours = emphours + 8;
				days = days +1;	    
				break;
			case 2:
				emphours = emphours + 4;
				break;
			default:
				break;
			}
		}
		
		System.out.println("No of days Employee Worked : "+days);   
		return emphours;
	}

	static int Total_Wage(){
		int Total_Wage = no_of_hours*wage_per_hour;
		return Total_Wage;
	}

	public static final int random = random();
	public static int wage_per_hour = 20;
	public static final int no_of_hours = hours();

	public static void main(String[] args){
		System.out.println("How many hours employee worked :" +no_of_hours);
		System.out.println("The Total Wage of Employee is " +Total_Wage());
	}
}