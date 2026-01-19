// CIT63 TempConverter project
//Jan/17/2025
//es

//create the scanner
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //prompt the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
    // convert the temperature to celsius

        double celsius = (fahrenheit - 32) * 5 / 9;
    //print the answer
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);

        input.close();
    }
}