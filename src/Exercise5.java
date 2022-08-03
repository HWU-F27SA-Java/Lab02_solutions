import java.util.Scanner;

/**
 * Week 2, Exercise 5.
 * @author Michael Lones
 */
public class Exercise5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		double value = in.nextDouble();
		double square = value * value * value;
		
		System.out.println("The square of "+value+" is "+square);
	}

}
