package LineComparsion;

import java.util.Scanner;

//Method is creating 
public class LineComparsion {
	public  void  LineComparsion(){
		System.out.println("Welcome to Line Comparsion Problem");
		
		//variables
		int x1, x2, y1, y2,p1,p2,q1,q2;
		double Length,Length1;
		Scanner sc = new Scanner(System.in);
		
		//gives 1st lines end pionts from user
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

		
		//gives 2nd lines end pionts from user
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

		
		Double line1 = Double.valueOf(Length);
		Double line2 = Double.valueOf(Length1);
		int val = line1.compareTo(line2);
		if (val == 0) {
			System.out.println("Line1 is equal to Line2");
		} else if (val > 0) {
			System.out.println("Line1 is greater than Line2");
		} else {
			System.out.println("Line1 is less than Line2");

		}
	
			
	}
	public static void main(String[] args) {
		LineComparsion lc = new LineComparsion();
		lc.LineComparsion();
	}
}
