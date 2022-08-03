import java.util.Scanner;

/**
 * Week 2, Exercise 7.
 * @author Michael Lones
 */
public class Exercise7 {

	// Declare constants
	static final int DAYS_IN_YEAR = 365;
	static final int HOURS_IN_DAY = 24;
	static final int MINUTES_IN_HOUR = 60;
	
	public static void main(String[] args) {
		// Read in age from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age in years: ");
		int age = scan.nextInt();
		
		// Convert values
		int days = age * DAYS_IN_YEAR;
		int hours = days * HOURS_IN_DAY;
		int minutes = hours * MINUTES_IN_HOUR;
		
		// Print them out
		// Note that I've split this over multiple lines to
		// make it more readable, requiring extra string addition.
		System.out.println("You are " + age + " years old, " +
				"which is the same as " + days + " days, or " +
				hours + " hours, or " + minutes + " minutes.");
	}

}
