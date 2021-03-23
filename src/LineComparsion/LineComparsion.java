package LineComparsion;

import java.util.Scanner;

public class LineComparsion {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparsion Problem");
	
		int x1, x2, y1, y2;
		double Length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point");
		y2 = sc.nextInt();
		Length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("Length of Line is: " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")" 	+ Length);
	
	}
}
