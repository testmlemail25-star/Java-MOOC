
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read in a string to be compared with the string "True"
        System.out.print("Give a string: ");
        String string = scanner.nextLine();
        
        // Print a message informing the user if their string is a match or not
        if (string.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
