package Part2;

public class FactorialException extends Exception {
    private int number;

    public FactorialException(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FactorialException: Invalid input number " + number + ". It should be between 0 and 15.";
    }
}
