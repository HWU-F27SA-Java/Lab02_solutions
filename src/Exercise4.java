/**
 * Week 2, Exercise 4.
 * @author INSERT YOUR NAME HERE
 */
public class Exercise4 {

	public static void main(String[] args) {
		// Time variables
		int daysInYear = 365;
		int hoursInDay = 24;
		int minutesInHour = 60;
		int age = 18;
		
		// Convert values
		int days = age * daysInYear;
		int hours = days * hoursInDay;
		int minutes = hours * minutesInHour;
		
		// Print them out
		System.out.println(days);
		System.out.println(hours);
		System.out.println(minutes);
	}

}
