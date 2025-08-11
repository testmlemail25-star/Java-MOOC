public class Summation {
    
    /**
     * Calculates the sum of four integer values
     * 
     * @param num1  the first integer
     * @param num2  the second integer
     * @param num3  the third integer
     * @param num4  the fourth integer
     * 
     * @return      the sum of the integer inputs 
     */
    public static int sum(int num1, int num2, int num3, int num4) {
        int sumOfIntegers = num1 + num2 + num3 + num4;
        return sumOfIntegers;
    }

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }
}
