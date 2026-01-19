// cit63 SimpleCalculator project
// Jan/17/2025
//es
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    // allows user to input the first number
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
    // allows user to input the second number
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
    //gives you the answer based on if it is addition, multiplication, or subtraction
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));

        input.close();
    }
}