/**
 * HelpMenu class implements Printable interface and Overrides it to print out
 * a help statement for the user.
 */
public class HelpMenu implements Printable {

    @Override
    public void print() {
            System.out.println("List of Operators: \n"
                    + "* for Multiplication\n"
                    + "- for Subtraction\n"
                    + "/ for Division\n"
                    + "+ for Addition\n"
                    + "% for Modulo Division\n"
                    + "^ for Power\n"
                    + "~ for Root of Any Root");
        }
    }
