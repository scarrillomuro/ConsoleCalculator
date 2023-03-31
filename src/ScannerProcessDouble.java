import java.util.Scanner;

public class ScannerProcessDouble {
    /**
     * Class ScannerProcessDouble test the String inputString to see if its a valid
     * double number, if so it returns this double number a String, it not, it
     * returns a null.
     * @param inputString -- a String entered via the Scanner to be tested via
     *                    Double.parseDouble() to see if it's a valid double number
     * @return String which is either a double value converted back to a String or null
     * if the passed-in String could not be converted to a String.
     */

    public static String confirmDouble(String inputString) {

        String doubleToStringReturnValue = "";
        try {
            double parseDoubleResult = Double.parseDouble(inputString);
            doubleToStringReturnValue = Double.toString(parseDoubleResult);
        } catch (NullPointerException e) {
            doubleToStringReturnValue = null;
        } catch (NumberFormatException e) {
            doubleToStringReturnValue = null;
        } catch (Exception e) { // Exception e -- should be very last
            // it is the catch-all, and the most general
            doubleToStringReturnValue = null;
        }
        return doubleToStringReturnValue;
    }

    /**
     * Class getString test the calculatorInput to see if it,s a valid double number
     * @param calculatorInput String input from user that will be tested to see if it is a valid double via the
     *                        confirmDouble method above and turn back to a string called confirmDoubleResults. It
     *                        also tests for PI and E and converts the PI and E back to a string. If its not a valid input,
     *                        it
     * @return String which is either a double value, PI, or E converted back to a String or null
     * if the passed-in String could not be converted to a String.
     */
    public static String getString(Scanner calculatorInput) {
        String confirmDoubleResult;
        String preNumberString = calculatorInput.nextLine();
        if (preNumberString.trim().equalsIgnoreCase("PI")) {
            confirmDoubleResult = String.valueOf(Math.PI);
        } else if (preNumberString.trim().equalsIgnoreCase("e")) {
            confirmDoubleResult = String.valueOf(Math.E);
        }  else {
            confirmDoubleResult = confirmDouble(preNumberString);
            if (confirmDoubleResult == null) {
                System.out.println("You have entered an invalid entry, please try again\n" +
                        "Please enter a number using the numeric pad.\n" +
                        "Also, PI or E are optional as values.");
            }
        }
        return confirmDoubleResult;
    }
}
