// cit63 CharDetails project
// Jan/18/2025
// ES
import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // to be able to let the user type a character
        System.out.print("Enter a character: ");
        char c = sc.nextLine().charAt(0);
//used to grab the first input
        System.out.println((int)c);
        System.out.println(Character.isLetter(c) ? "Letter"
                : Character.isDigit(c) ? "Digit" : "Other");
//used to check if it is a digit or a letter
        sc.close();
    }
}