
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = -1;
        // Read in name, age pairs until a blank line is recieved
        while (true) {
            String nameAndAge = scanner.nextLine();
            
            if (nameAndAge.equals("")) {
                break;
            }
            // Split the name and age into separate array elements for parsing
            String[] splitNameAndAge = nameAndAge.split(",");
            
            // Cast the age as an integer for comparison to current largest age
            int age = Integer.valueOf(splitNameAndAge[1]);
            
            // Update the largest age if necessary
            if (age > oldestAge) {
                oldestAge = age;
            }
        }
        
        System.out.println("Age of the oldest: "+oldestAge);
    }
}
