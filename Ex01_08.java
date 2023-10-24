import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius for a circle: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double perimeter = 2 * radius * Math.PI;
		
		System.out.println("The area is " + area + " and the perimeter is " + perimeter);

	}

}
