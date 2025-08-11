
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept user input until blank line is entered 
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            } else {
                // Split line into pieces printing each piece on a new line
                String[] pieces = string.split(" ");
                for (String piece : pieces) {
                    System.out.println(piece);
                }
            }
        }

    }
}
