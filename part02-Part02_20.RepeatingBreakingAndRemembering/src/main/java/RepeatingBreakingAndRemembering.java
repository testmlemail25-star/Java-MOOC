
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Sum of numbers not equal to -1
        int sum = 0;
        // Count of numbers not equal to -1
        int count = 0;
        // Count of even numbers
        int countEven = 0;
        // Count of odd numbers (not equal to -1)
        int countOdd = 0;
        

        // Prompt user to enter numbers
        System.out.println("Give numbers:");

        // Keep accepting numbers until user enters -1
        while (true) {
            int number = Integer.valueOf(scan.nextLine());

            if (number == -1) {
                break;
            }
            
            // Increment the even/odd number count
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            // Update the sum
            sum += number;
            count++;
        }
        
        // Calculate the average of the non -1 numbers
        double average = (double) sum / count;
        
        System.out.println("Thx! Bye!");
        // Print the sum of all numbers (except -1)
        System.out.println("Sum: " + sum);
        // Print the count of all numbers (except -1)
        System.out.println("Numbers: "+count);
        // Print the average of the numbers (except -1)
        System.out.println("Average: "+average);
        // Print the count of all even numbers
        System.out.println("Even: "+countEven);
        // Print the count of all odd numbers (except -1)
        System.out.println("Odd: "+countOdd);
        
    }
}
