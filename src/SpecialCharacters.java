/**
 * SpecialCharacters an Enum class that takes constructors as strings
 */
public enum SpecialCharacters {
    // enum constants calling ghe enum constructors
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    MODULUS("%"),
    EXPONENTIATION("^"),
    NTH_ROOT("~");
    /**
     *
     */
    // private enum constructor
    private final String value;
    SpecialCharacters (String value){
        this.value = value;
    }

    /**
     * String created to return the value of the enum constructors.
     * @return will return the constructors assign to the enums.
     */
    public String toString()
    {
        return this.value; //This will return , + , - , * , / , % , ^ , or ~
    }

}
