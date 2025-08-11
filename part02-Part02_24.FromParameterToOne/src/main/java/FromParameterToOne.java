
public class FromParameterToOne {

    public static void main(String[] args) {

    }

    /**
     * Method to print a descending sequence from a number to 1
     *
     * @param number The upper limit of the sequence
     */
    public static void printFromNumberToOne(int number) {

        // Print all numbers in the descending sequence
        while (number > 0) {
            System.out.println(number);
            number = number - 1;
        }
    }
}
