package LineComparsion;

import java.util.Scanner;

public class LineComparsion {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparsion Problem");

		int x1, x2, y1, y2,p1,p2,q1,q2;
		double Length,Length1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point");
		y2 = sc.nextInt();
		Length= Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("Length of Line is: " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")" + Length);

		
		
		System.out.println("Enter p1 point");
		p1 = sc.nextInt();
		System.out.println("Enter q1 point");
		q1 = sc.nextInt();
		System.out.println("Enter p2 point");
		p2 = sc.nextInt();
		System.out.println("Enter q2 point");
		q2 = sc.nextInt();
		Length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		Length1 = Math.sqrt((p2 - p1) ^ 2 + (q2 - q1) ^ 2);
		if (Length == Length1) {
			System.out.println("Line is equal to Line1");
		} else {
			System.out.println("Line is not equal to Line1");
		}

		if (Length == Length1) {
			System.out.println("Line is equal to Line1");
		} else if (Length > Length1) {
			System.out.println("Line is greater than Line1");
		} else {
			System.out.println("Line is less than Line1");

		}
	}
}
