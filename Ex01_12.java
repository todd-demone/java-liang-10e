/**
 * 1.12 (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class Ex01_12 {

	public static void main(String[] args) {
		final double ML_TO_KM_FACTOR = 1.6;
		
		int miles = 24;
		int hrs = 1;		
		int min = 40;
		
		// Convert miles to km
		double km = miles * ML_TO_KM_FACTOR;
		
		// Convert minutes to hours and add amount to totalHrs
		double totalHrs = hrs + (min / 60.0);
		
		// Calculate km per hour
		double kph = km / totalHrs;
		
		System.out.println("Running " 
							+ miles + " miles in " 
							+ hrs + " hours and "
							+ min + " minutes is equal to "
							+ kph + " km per hour.");
		
	}

}
