
public class AdvancedAstrology {

    /**
     * Print out a specified number of stars on the same line. Print a line
     * break after the row of stars.
     *
     * @param number number of stars to print
     */
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    /**
     * Prints a user-specified number of spaces
     *
     * @param number
     */
    public static void printSpaces(int number) {
        // Prints a single space repeatedly on the same line
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    /**
     * Prints a triangle with a user-specified base length
     *
     * @param size length of the base of the triangle
     */
    public static void printTriangle(int size) {
        int maxSpaces = size - 1;

        // Print rows of length size for tree leaves.
        // Each row has an ascending number of stars.
        // The remaining entries in the row are spaces.
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }

    }

    /**
     * Program to print a christmas tree with a rectangular base
     *
     * @param height The number of rows above the base in the tree
     */
    public static void christmasTree(int height) {
        // Generate rows indiviually
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        
        // Print rectangular base of tree
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
