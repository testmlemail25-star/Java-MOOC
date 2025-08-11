
public class Averaging {

    /**
     * Calculates the sum of four integers
     * 
     * @param number1   the first integer
     * @param number2   the second integer
     * @param number3   the third integer
     * @param number4   the fourth integer
     * @return          the sum of the four integers
     */
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
    
    /**
     * Calculates the average of four integers
     * 
     * @param number1   the first integer
     * @param number2   the second integer
     * @param number3   the third integer
     * @param number4   the fourth integer
     * @return          the average of the four integers
     */
    public static double average(int number1, int number2, int number3, int number4) {
        return (double) sum(number1, number2, number3, number4) / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
