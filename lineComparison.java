import java.util.*;
public class lineComparison{
        public static void main(String[] args){
                System.out.println("Welcome to Line Comparison Problem");
		double x1;
                System.out.println("Enter value for x1: ");
                Scanner s1 = new Scanner(System.in);
                x1=s1.nextFloat();
                double y1;
                System.out.println("Enter value for y1: " );
                Scanner s2 = new Scanner(System.in);
                y1=s2.nextFloat();
                double x2;
                System.out.println("Enter value for x2: " );
                Scanner s3 = new Scanner(System.in);
                x2=s3.nextFloat();
                double y2;
                System.out.println("Enter value for y2: " );
                Scanner s4 = new Scanner(System.in);
                y2=s4.nextFloat();
		int x3 = 3;
		int y3 = 4;
		int x4 = 5;
		int y4 = 7; 
                double d1 = (x2-x1);
                double d2 = (y2-y1);
		double d3 = (x4-x3);
		double d4 = (y4-y3);
                double square1 = Math.pow(d1,2);
                double square2 = Math.pow(d2,2);
		double square3 = Math.pow(d3,2);
		double square4 = Math.pow(d4,2);
		double distance1 = Math.sqrt(square1+square2);
		double distance2 = Math.sqrt(square3+square4);
		if (distance1 == distance2)
				System.out.println("Both lines are equal");
		else if (distance1 > distance2)
				System.out.println("Length of Line 1 is greater and Length of Line 2 is smaller");
		else 
				System.out.println("Length of Line 2 is greater and Length of Line 1 is smaller");
	
                }
}
