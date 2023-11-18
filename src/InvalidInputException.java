public class InvalidInputException extends Exception{
    public InvalidInputException(String str)
    {
        super("Both the players Health should be greater than zero");
    }

}
