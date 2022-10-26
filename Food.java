/*
 * The HelloWorld program implements an application that
  *   simply displays "Hello World!" to the standard output.
 *
 * By:      Devin Jhu
 * Version: 1.0
 * Since:   2022-10-25
 */

import java.util.Scanner;

/**
 * This function calculates the time to warm up food.
 */
final class Food {
    /**
     * Constant for soup heat time.
    */
    public static final double SOUPTIME = 105;
    /**
     * Constant for sub heat time.
    */
    public static final double SUBTIME = 60;
    /**
     * Constant for pizza heat time.
    */
    public static final double PIZZATIME = 45;
    /**
     * Constant for time increase for two items.
    */
    public static final double TWOFOODS = 1.5;
    /**
     * Constant for time increase for three items.
    */
    public static final double THREEFOODS = 2;
    /**
     * Constant for the number of items.
    */
    public static final String ONE = "1";
    /**
     * Constant for the number of items.
    */
    public static final String TWO = "2";
    /**
     * Constant for the number of items.
    */
    public static final String THREE = "3";
    /**
     * Constant for sub.
    */
    public static final String SUB = "sub";
    /**
     * Constant for soup.
    */
    public static final String SOUP = "soup";
    /**
     * Constant for pizza.
    */
    public static final String PIZZA = "pizza";
    /**
     * Variable for the total time for the warm up.
    */
    private static double time;
    /**
     * Variable for seconds.
    */
    private static double seconds;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Food() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // input
        final Scanner userFoodInput = new Scanner(System.in);
        final Scanner userAmount = new Scanner(System.in);
        System.out.println("What food (sub, pizza, or soup): ");
        final String userInput = userFoodInput.nextLine();
        System.out.println("How many (max 3): ");
        final String userInput2 = userAmount.nextLine();
        // process & output
        //   this sees if the userinput matchs the conditions.
        if (userInput.equals(SOUP) || userInput.equals(PIZZA)
               || userInput.equals(SUB)) {

            if (userInput.equals(SOUP)) {
                time = SOUPTIME;
            } else if (userInput.equals(PIZZA)) {
                time = PIZZATIME;
            } else if (userInput.equals(SUB)) {
                time = SUBTIME;
            }

            if (userInput2.equals(ONE) || userInput2.equals(TWO)
                                || userInput2.equals(THREE)) {
                if (userInput2.equals(TWO)) {
                    time = time * TWOFOODS;
                } else if (userInput2.equals(THREE)) {
                    time = time * THREEFOODS;
                }
                seconds = time;
                System.out.println("it will take " + seconds + " seconds.");
            } else {
                System.out.println("not a number");
            }
        } else {
            System.out.println("That is an invalid input.");
        }
        System.out.println("\nDone.");
    }
}
