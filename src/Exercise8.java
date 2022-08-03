import java.util.Scanner;

/**
 * Week 2, Exercise 8.
 * @author Michael Lones
 */
public class Exercise8 {

	public static void main(String[] args) {
		// note that you only need to create a scanner once
		Scanner scan = new Scanner(System.in);
		
		// read in user's name
		System.out.println("What is your name?");
		String name = scan.next(); // reads next word entered by user
		
		// read in user's height
		System.out.println("Please enter your height, in metres: ");
		double height = scan.nextDouble(); // reads next value as floating-point
		
		// read in number of siblings
		System.out.println("How many siblings do you have?");
		int siblings = scan.nextInt(); // reads next value as integer
		
		// remind the user what they just told you
		System.out.println("Hello " + name + ", you are " + height +
				" metres tall, " + "you have " + siblings + " siblings," +
				" and your name is "+ name.length() + " letters long.");
	}

}
