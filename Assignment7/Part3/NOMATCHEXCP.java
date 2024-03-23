package Part3;

public class NOMATCHEXCP extends Exception {
    private String inputString;

    public NOMATCHEXCP(String inputString, int lineNumber) {
        super("NOMATCHEXCP: Input string does not match");
        this.inputString = inputString;
        System.out.println("Error at line " + lineNumber + ": Input string '" + inputString + "' does not match");
    }
}
