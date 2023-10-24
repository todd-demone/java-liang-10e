import java.util.Scanner;

public class Ex01_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a width and height for a rectangle: ");
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		double area = width * height;
		double perimeter = width + width + height + height;
		
		System.out.println("The area of the rectangle is " + area + " and the perimeter is " + perimeter);

	}

}
