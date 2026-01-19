// cit63 Circle area project
// Jan/17/2025
// es
//import the scanner
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //prompt the user
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
    //calculate the result
        double area = Math.PI * radius * radius;
    //print the result
        System.out.println("The area of the circle is: " + area);

        input.close();
    }
}