
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Read in sentence from user from which the last word will be found
            String sentence = scanner.nextLine();

            // Exit program if user input is a blank line
            if (sentence.equals("")) {
                break;
            }

            // Split the sentences on spaces between words
            String[] splitSentence = sentence.split(" ");

            // Print the last word of the sentence
            System.out.println(splitSentence[splitSentence.length - 1]);
        }
    }
}
