
public class Smallest {
    
    /**
     * Returns the smallest of two integer values
     * 
     * @param   number1     first integer
     * @param   number2     second integer
     * @return  smallest    the lowest of the two integer values
     */
    public static int smallest(int number1, int number2) {
        
        int smallest = number1;
        
        // change smallest number if needed
        if (number2 < number1) {
            smallest = number2;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
