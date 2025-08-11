
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read in strings until user enters a blank line
        while (true) {
            String line = scanner.nextLine();
            // exit loop when blank line is entered
            if (line.equals("")) {
                break;
            }
            // Otherwise split the line on whitespaces and print each word
            // containing "av"
            String[] splitLine = line.split(" ");
            for (String word : splitLine) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

    }
}
