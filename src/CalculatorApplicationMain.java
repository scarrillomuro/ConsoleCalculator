/**
 * This is the primary application class for the Console Calculator project that uses the Calculator
 * class in order to perform calculations based on user input.
 * @author Samuel Carrillo Muro
 */
public class CalculatorApplicationMain {
    /**
     * Calculator Application main is the main method for this application. It displays a welcome message
     * with a help hint message before the start of application. It instantiates the Calculator class byt creating
     * an object called calculator. The calculator object is used to call the method from Calculator class to take
     * user input, performed and displays calculations.
     * @param args String array of parameters separated by a space, entered on
     *             the command line.
     */

    public static void main (String [] args) {

        // Display a welcome message.
        System.out.println("Welcome to the console calculator\n");

        // Display Instructions.
        System.out.println("Hints: Don't worry, when entering variables, if enter incorrectly,\n" +
                "a help message will appear with instruction.\n" +
                "Variables can consist of numbers, PI or E.\n" +
                "For operators, type help for a list of options during the operator prompt.\n");
        // Instantiate the Calculator class by creating an object called calculator.
        Calculator calculator = new Calculator();
        calculator.calculator(); // object calculator used to call calculator method.


    }
}
