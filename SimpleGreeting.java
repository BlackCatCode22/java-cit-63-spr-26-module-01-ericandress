//simpleGreeting.java
// eS 1/15/25
// simple greetings project
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        System.out.println("\n\n***** Welcome to my simple Greeting Program! ***** \n\n");

        // Create a scanner input
        Scanner scanner = new Scanner(System.in);

        // Create a String variable to hold our user's name.
        String myUserName;

        // This will prompt the user for their name.
        System.out.println("\n Please enter your name: ");

        // get the input into our variable
        myUserName = scanner.nextLine();

        // Prove that you got the user name.
        System.out.println("\n Hello " + myUserName + " how are you today?");

    }
}