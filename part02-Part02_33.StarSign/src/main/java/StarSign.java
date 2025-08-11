
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    /**
     * Print out a specified number of stars on the same line.
     * Print a line break after the row of stars.
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
     * Print out a square made of rows of stars
     *
     * @param size the length of one edge of the square.
     */
    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(size);
            // move to new line unless on the final row to avoid 
            // trailing newline
        }
    }

    /**
     * Prints a rectangle of user-specified width and height constructed from
     * rows of stars
     *
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    /**
     * Prints an isosceles triangle made of rows of stars. 
     *
     * @param size the length of the two shorter sides of the triangle
     */
    public static void printTriangle(int size) {

        // vary the number of stars in each row
        for (int i = 1; i <= size; i++) {
            printStars(i);

        }

    }
}
