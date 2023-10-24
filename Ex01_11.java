
/**
 * 1.11 (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds

 * Write a program to display the population for each of the next five years. Assume the
 * current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 * integers perform division, the result is an integer. The fractional part is truncated. For
 * example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 * the fractional part, one of the values involved in the division must be a number with a
 * decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
public class Ex01_11 {

	public static void main(String[] args) {
		
		final int YEARS = 5;
		final int DAYS_IN_YR = 365;
		final int SECS_IN_YR = 60 * 60 * 24 * DAYS_IN_YR;
//		 System.out.println("Total seconds in year: " + TOTAL_SECONDS_IN_YEAR);
		final int SECS_PER_BIRTH = 7;
		final int SECS_PER_DEATH = 13;
		final int SECS_PER_IMMIGRANT = 45;
		
		int pop = 312032486;
		int year;
		
		for (year = 1; year <= 5; year++) {
			pop = pop + (SECS_IN_YR / SECS_PER_BIRTH) - (SECS_IN_YR / SECS_PER_DEATH) + (SECS_IN_YR / SECS_PER_IMMIGRANT);
			System.out.println("Year " + year + " population: " + pop);
		}
		
	}

}
