import java.util.Random;
public class UC1 {
	static int random() {
		Random random = new Random();
		int i = random.nextInt(2)+1;
		return i;
	}
	static String attendence() {
		String attendence;
		if (random() == 1) {
			attendence = "present";
		}
		else {
			attendence = "absent";
		}
		return attendence;
	}
	
	public static void main(String[] args) {
		System.out.println("The Employee is " +attendence());
	}
}