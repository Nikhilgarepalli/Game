public class Validate {
    public static void validateInput(int aHealth, int bHealth) throws InvalidInputException {
        if (aHealth <= 0 && bHealth <= 0) {
            throw new InvalidInputException("Both health values must be greater than zero.");
        }
    }
}

