//FavoriteNumberProject
//Jan/15/2025
//eS

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user for their favorite number
        System.out.print("Enter your favorite number: ");

        // Stores the number in a variable (int = whole numbers only)
        int favoriteNumber = input.nextInt();

        // Output the number back to the user with a message
        System.out.println("\nYour favorite number is: " + favoriteNumber);
        System.out.println("Good pick!");

        // Close the Scanner to prevent leaks
        input.close();
    }
}

