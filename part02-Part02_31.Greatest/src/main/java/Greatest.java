
public class Greatest {

    /**
     * Returns the largest of three integer values
     * 
     * @param number1   the first integer
     * @param number2   the second integer
     * @param number3   the third integer
     * @return largest  the largest of the three integers
     */
    public static int greatest(int number1, int number2, int number3) {
        
        // Set the first number to be the largest
        int largest = number1;
        
        // if the second number is lager than the first
        if (number2 > largest) {
            largest = number2;
        }
        
        // check if third number is larger than the current largest
        if (number3 > largest) {
            largest = number3;
        }

        return largest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
