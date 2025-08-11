
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for a repititon count
        System.out.println("How many times?");
        int iterations = Integer.valueOf(scanner.nextLine());
        
        // Print message a specified number of times
        while (iterations > 0) {
            printText();
            iterations = iterations - 1;
        }
        
    }
    
    // Method to print a predefined message
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
