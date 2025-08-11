
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfOldest = "";
        int ageOfOldest = 0;

        while (true) {
            String nameAndAge = scanner.nextLine();
            if (nameAndAge.equals("")) {
                break;
            }

            String[] splitNameAndAge = nameAndAge.split(",");
            int age = Integer.valueOf(splitNameAndAge[1]);
            if (age > ageOfOldest) {
                ageOfOldest = age;
                nameOfOldest = splitNameAndAge[0];
            }
        }

        System.out.print("Name of the oldest: " + nameOfOldest);

    }
}
