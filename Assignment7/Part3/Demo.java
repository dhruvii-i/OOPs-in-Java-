
package Part3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(input, new Throwable().getStackTrace()[0].getLineNumber());
            }
            System.out.println("Input string matches 'India'");
        } catch (NOMATCHEXCP e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
