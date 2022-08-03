/**
 * Week 2, Exercise 6.
 * @author Michael Lones
 */
public class Exercise6 {

	// Declare constants
	// Note that the names are capitalised and use hyphens
	static final int DAYS_IN_YEAR = 365;
	static final int HOURS_IN_DAY = 24;
	static final int MINUTES_IN_HOUR = 60;
	
	public static void main(String[] args) {
		// Time variable
		int age = 18;
		
		// Convert values
		int days = age * DAYS_IN_YEAR;
		int hours = days * HOURS_IN_DAY;
		int minutes = hours * MINUTES_IN_HOUR;
		
		// Print them out
		System.out.println(days);
		System.out.println(hours);
		System.out.println(minutes);
	}

}
