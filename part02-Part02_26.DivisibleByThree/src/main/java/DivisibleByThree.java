
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(2,9);

    }
    
    /**
     * Prints all numbers divisible by 3 in a range
     * Assumes beginning is less than or equal to the end
     * 
     * @param beginning lower limit of the range
     * @param end       upper limit of the range
     */
    public static void divisibleByThreeInRange(int beginning, int end){
        while (beginning <= end) {
            
            // Check divisibility by 3 using modulo operation
            if (beginning % 3 == 0){
                System.out.println(beginning);
            }
            
            beginning++;
        }
    }
}
