/*
 * 
 * 3. Write a Java programme that takes an integer from the user and throws an exception
      if it is negative.Demonstrate Exception handling of same program as solution.
 * 
 * 
 */
import java.util.Scanner;

public class QUESTION03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");

        try {
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed!");
            }

            System.out.println("You entered: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// Custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}