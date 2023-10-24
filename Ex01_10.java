import java.util.Scanner;

/**
 * 1.10 (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 */
public class Ex01_10 {

	public static void main(String[] args) {
		final double KM_TO_MILES_FACTOR = .621371;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter kilometres, minutes and seconds: ");
		double km = input.nextDouble();
		int minutes = input.nextInt();
		int seconds = input.nextInt();
		
		// Convert km to miles
		double miles = km * KM_TO_MILES_FACTOR;
		// System.out.println("total miles: " + miles);
		
		// Convert minutes to seconds and add to seconds
		int totalSeconds = seconds + (minutes * 60);
		// System.out.println("total seconds: " + totalSeconds);
		
		// Convert seconds to hours 
		double hours = totalSeconds / 3600.0;
		// System.out.println("total hours: " + hours);
		
		double mph = miles / hours;
		
		System.out.println("The average speed in miles per hour when a runner runs " + 
							km + " kilometres in " + 
							minutes + " minutes and " + 
							seconds + " seconds is " + 
							mph + " mph. "
						   );
		
	}

}
