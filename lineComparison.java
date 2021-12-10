import java.util.*;
public class lineComparison{
        public static void main(String[] args){
                System.out.println("Welcome to Line Comparison Problem");
                float x1;
                System.out.println("Enter value for x1: ");
                Scanner s1 = new Scanner(System.in);
                x1=s1.nextFloat();
                float y1;
                System.out.println("Enter value for y1: " );
                Scanner s2 = new Scanner(System.in);
                y1=s2.nextFloat();
                float x2;
                System.out.println("Enter value for x2: " );
                Scanner s3 = new Scanner(System.in);
                x2=s3.nextFloat();
                float y2;
                System.out.println("Enter value for y2: " );
                Scanner s4 = new Scanner(System.in);
                y2=s4.nextFloat();
                float d1 = (x2-x1);
                float d2 = (y2-y1);
                float square1 = d1*d1;
                float square2 = d2*d2;
                System.out.println("The Distanve between two lines :" + Math.sqrt(square1+square2));

}
}
