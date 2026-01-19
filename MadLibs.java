//cit63 MadLibs project
//Jan/18/2025
//ES
import java.util.Scanner;
// reads the user input
public class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adjective: "); String a = sc.nextLine();
        //asks for the adjective
        System.out.print("Noun: "); String n = sc.nextLine();
        //asks for the noun
        System.out.print("Verb (past): "); String v = sc.nextLine();
        //asks for past tense verb
        System.out.print("Place: "); String p = sc.nextLine();
        // asks for the place
        System.out.println("\nA " + a + " " + n + " " + v + " to " + p + ".");

        sc.close();
    }
}