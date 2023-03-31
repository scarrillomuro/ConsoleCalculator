/**
 * Class Calculator is used to get input from user, calculate and display answer.
 * It extends Equations class.
 */

import java.util.Scanner;

public class Calculator extends Equations {
    /**
     * Method Calculator extends Equations and implements the MenuHelp.
     * Calculator also instantiates the Operator class and creates a Scanner object named calculatorInput.
     * Calculator method takes input from user for first/second values and an operator and checks for the
     * validity of the user input. It also displays the answer of the calculations.
     */

    public void calculator () {

        Operator arithmeticOperators = new Operator(); // Instantiating Operator class by creating an object called arithmeticOperators
        Scanner calculatorInput = new Scanner(System.in); // Creates a Scanner object named calculatorInput

        String choice = "yes";
        // creates a while loop that allows calculator to run until user types no.
        while (choice.trim().equalsIgnoreCase("yes")) {

            // Obtain first variable via Scanner and confirm it is a valid double number,
            // Pi, or E number with a do while loop.
            String confirmDoubleResults;
            do {
                System.out.println("Enter first variable: ");
                confirmDoubleResults = getString(calculatorInput);
            } while (confirmDoubleResults == null);
            double firstVariable = Double.parseDouble(confirmDoubleResults); // convert String to a double

            // prompt the user to enter an operator
            System.out.println("Enter an operator: Type help for list");
            // validate the input from user by implementing the getOperator string via the arithmeticOperators object 
            // instantiating by the Operator class. 
            String operator = arithmeticOperators.getOperator(calculatorInput);
            
            // An if statement is used to calculate the root of the first number than loop again if user chooses.
            String results = "";
            if (operator.trim().equalsIgnoreCase("~")) {
                System.out.println("To the root of what number");
                double secondVariable = Double.parseDouble(calculatorInput.nextLine()); // convert a string to a double 
                results = "Answer is: " + firstVariable + " root of " + secondVariable + " = " + super.root(firstVariable, secondVariable);
                System.out.println(results);
                System.out.println("Would you like to input another calculation? (yes/no)");
                boolean invalidChoice = true;
                while (invalidChoice) {
                    choice = calculatorInput.nextLine(); // get input from user
                    if (choice.trim().equalsIgnoreCase("yes") || choice.trim().equalsIgnoreCase("no")) {
                        invalidChoice = false; // allows program to continue
                    }
                }
                continue; // used to jump back to the beginning of the while loop. 
           }
            // Obtain second variable via Scanner and confirm it is a valid double number,
            // Pi, or E number.
            do {
                System.out.println("Enter second variable: ");
                confirmDoubleResults = getString(calculatorInput);
            } while (confirmDoubleResults == null);
            double secondVariable = Double.parseDouble(confirmDoubleResults);

            // calculate and display results.
            if (operator.trim().equalsIgnoreCase(SpecialCharacters.MULTIPLICATION.toString())) {
                results = "Answer is: " + firstVariable + " * " + secondVariable + " = "
                        + super.multiply(firstVariable, secondVariable);
                System.out.println(results);
            } else if (operator.trim().equalsIgnoreCase(SpecialCharacters.DIVISION.toString())) {
                results = "Answer is: " + firstVariable + " / " + secondVariable + " = "
                        + super.divide(firstVariable, secondVariable);
                System.out.println(results);
            } else if (operator.trim().equalsIgnoreCase(SpecialCharacters.SUBTRACTION.toString())) {
                results = "Answer is: " + firstVariable + " - " + secondVariable + " = "
                        + super.subtract(firstVariable, secondVariable);
                System.out.println(results);
            } else if (operator.trim().equalsIgnoreCase(SpecialCharacters.ADDITION.toString())) {
                results = "Answer is: " + firstVariable + " + " + secondVariable + " = "
                        + super.add(firstVariable, secondVariable);
                System.out.println(results);
            } else if (operator.trim().equalsIgnoreCase(SpecialCharacters.NTH_ROOT.toString())) {
                results = "Answer is: " + firstVariable + " raise to the power of " + secondVariable + " = "
                        + super.power(firstVariable, secondVariable);
                System.out.println(results);
            } else if (operator.trim().equalsIgnoreCase(SpecialCharacters.MODULUS.toString())) {
                results = "Answer is: " + firstVariable + " % " + secondVariable + " = "
                        + super.modulo(firstVariable, secondVariable) + " as remainder of division";
                System.out.println(results);
            } else {
                System.out.println("Please enter a valid operator.");
            }

            // Ask if they would like to continue.
            System.out.println("Would you like to input another calculation? (yes/no)");

            boolean invalidChoice = true;
            while (invalidChoice) {
                choice = calculatorInput.nextLine(); // get input from user
                if (choice.trim().equalsIgnoreCase("yes") || choice.trim().equalsIgnoreCase("no")) {
                    invalidChoice = false; // allows program to continue
                } else {
                    System.out.println("Please enter yer or no");
                }
            }
        }
        calculatorInput.close();
        System.out.println("Thank you for using the console calculator. Good Bye!");
    }
}

