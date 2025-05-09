package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter 1st number : ");
            float n1 = input.nextFloat();

            System.out.print("Enter 2nd number: ");
            float n2 = input.nextFloat();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);

            switch (operator) {
                case '+' -> System.out.println("Result: " + (n1 + n2));
                case '-' -> System.out.println("Result: " + (n1 - n2));
                case '*' -> System.out.println("Result: " + (n1 * n2));
                case '/' -> {
                    if (n2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    System.out.println("Result: " + (n1 / n2));
                }
                case '%' -> {
                    if (n2 == 0) {
                        throw new ArithmeticException("Cannot perform modulus by zero.");
                    }
                    System.out.println("Result: " + (n1 % n2));
                }
                default -> throw new IllegalArgumentException("Invalid operator. Use +, -, *, /, or %.");
            }

        } catch (InputMismatchException ime) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println("Error: " + iae.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e);
        } finally {
            input.close();
            System.out.println("Calculator operation completed.");
        }
    }
}
