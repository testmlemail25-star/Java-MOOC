
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int birthYearSum = 0;
        int nameCount = 0;
        int longestNameLength = 0;
        String longestName = "";
        
        while (true) {
            String nameAndBirthYear = scanner.nextLine();
            
            if (nameAndBirthYear.isEmpty()) {
                break;
            }
            
            String[] splitNameBirthYear = nameAndBirthYear.split(",");
            int nameLength = splitNameBirthYear[0].length();
            int birthYear = Integer.valueOf(splitNameBirthYear[1]);
            String name = splitNameBirthYear[0];
            
            if (nameLength > longestNameLength) {
                longestNameLength = nameLength;
                longestName = name;
            }
            
            birthYearSum += birthYear;
            nameCount++;
        }
        
        System.out.print("Longest name: "+longestName);
        double averageBirthYear = (double) birthYearSum / nameCount;
        System.out.print("Average of the birth years: " + averageBirthYear);

    }
}
