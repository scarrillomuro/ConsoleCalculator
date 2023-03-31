/**
 * Equations class which extends ScannerProcessDouble contain the mathematical algorithms
 * used to performed calculations such as multiplication, division, addition, subtraction, power,
 * and square root to any root.
 */
public class Equations extends ScannerProcessDouble {
    /**
     * Method that multiplies two numbers.
     * @param firstVariable is a double number taken from the user input
     * @param secondVariable is a double number taken from the user input
     * @return the multiplication of the firstVariable by the secondVariable.
     */
    public double multiply(double firstVariable, double secondVariable) {
        double answer = firstVariable * secondVariable;
        return answer;
    }
    /**
     * Method that divides two numbers
     * @param firstVariable is a double number taken from the user input
     * @param secondVariable is a double number taken from the user input
     * @return the division of the firstVariable by the secondVariable.
     */
    public double divide (double firstVariable, double secondVariable) {
        double answer = firstVariable / secondVariable;
        return answer;
    }
    /**
     * Method that adds two numbers.
     * @param firstVariable is a double number taken from the user input
     * @param secondVariable is a double number taken from the user input
     * @return the addition of firstVariable and secondVariable.
     */
    public double add (double firstVariable, double secondVariable) {
        double answer = firstVariable + secondVariable;
        return answer;
    }

    /**
     * Method that subtract two numbers.
     * @param firstVariable is a double number taken from the user input
     * @param secondVariable is a double number taken from the user input
     * @return the subtraction of the firstVariable by the secondVariable.
     */
    public double subtract (double firstVariable, double secondVariable) {
        double answer = firstVariable - secondVariable;
        return answer;
    }
    /**
     * Method that raises the power of any number.
     * @param firstVariable is a double number taken from the user input.
     * @param secondVariable is a double number taken from the user input.
     * @return an answer that takes the firstVariable and raises to any power(secondVariable).
     */
     public double power (double firstVariable, double secondVariable) {
        double answer = firstVariable;
        for (int x = 2; x <=secondVariable; x++) {
            answer *= firstVariable;
        }
        return answer;
    }

    /**
     * A method that divides two number that returns the leftover product.
     * @param firstVariable is a double number taken from the user input.
     * @param secondVariable is a double number taken from the user input.
     * @return the leftover from the division of the first and second number.
     */
    public double modulo (double firstVariable, double secondVariable) {
        double answer = firstVariable % secondVariable;
        return answer;
    }

    /**
     * Method that raises a number to any root.
     * @param firstVariable is a double number taken from the user input.
     * @param secondVariable is a double number taken from the user input.
     * @return an answer that takes firstVariable to any root (secondVariable).
     */
    public double root(double firstVariable, double secondVariable) {
        double answer = Math.pow(firstVariable, (1 / secondVariable));
        return answer;
    }
}
