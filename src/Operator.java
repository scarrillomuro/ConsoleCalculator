/**
 * Operator class is used to test out user input for correct operator choice.
 */

import java.util.Scanner;

public class Operator  {
    /**
     * Class getOperator is a class that is used to test input user to check for invalid entry that does not
     * match a desire operator used by the application.
     * @param getOperator a String entered via the Scanner to be tested by the boolean expression to see
     *                    if it's a valid operator. It uses the Enum SpecialCharacters to make sure that the
     *                    operators used to compare the String are not changeable but final.
     * @return String which is either a valid operator if the boolean equals false, allowing the program to continue
     * by exiting the while loop. If not, it displays a message to the user to enter a valid operator. Also, if a user
     * has issues, they may enter "Help", which prints out instructions via HelpMenu class
     * to enter a valid operator.
     */

    public String getOperator(Scanner getOperator) {
        // Instantiates the HelpMenu class by creating an object called help.
        HelpMenu help = new HelpMenu();

        String operator = "";
        boolean nonValidOperator = true;
        while (nonValidOperator) { // while loops that validates operator via a boolean.
            operator = getOperator.nextLine(); // get input from user via Scanner
            if (operator.trim().equalsIgnoreCase(SpecialCharacters.ADDITION.toString())
                    || operator.trim().equalsIgnoreCase(SpecialCharacters.EXPONENTIATION.toString())
                    || operator.trim().equalsIgnoreCase(SpecialCharacters.MULTIPLICATION.toString())
                    || operator.trim().equalsIgnoreCase(SpecialCharacters.MODULUS.toString())
                    || operator.trim().equalsIgnoreCase(SpecialCharacters.SUBTRACTION.toString())
                    || operator.trim().equalsIgnoreCase(SpecialCharacters.NTH_ROOT.toString())
                    || operator.trim().equalsIgnoreCase(SpecialCharacters.DIVISION.toString())) {
                nonValidOperator = false; // program continues
            } else if (operator.trim().equalsIgnoreCase("Help")) { // Display help if user inputs help.
                help.print(); // print out statement from the HelpMenu class.
            } else {
                nonValidOperator = true; // if true, prints out statement and prints out instructions.
                System.out.println("Please enter a valid operator from list provide");
            }
        }
        return operator; // returns a valid operator
    }
}
