//cit63 SimpleInterest project
//Jan/18/2025
//ES
import java.util.Scanner;
//used to allow users to put their input
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: "); double p = sc.nextDouble();
        //asks the user to input the principle
        System.out.print("Rate (%): "); double r = sc.nextDouble();
        //asks the user for the rate
        System.out.print("Time (years): "); double t = sc.nextDouble();
        // asks the user for the years
        System.out.println("Simple Interest: " + (p * r * t / 100));
        // gives you the simple interest
        sc.close();
    }
}
