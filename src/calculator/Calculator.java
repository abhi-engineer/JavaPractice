package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter 1st number : ");
            float n1 = input.nextFloat();
            System.out.print("Enter 2nd number: ");
            float n2 = input.nextFloat();
            System.out.print("Enter operator : ");
            char operator = input.next().charAt(0);
            switch (operator) {
                case '+' -> System.out.println(n1 + n2);
                case '-' -> System.out.println(n1 - n2);
                case '*' -> System.out.println(n1 * n2);
                case '/' -> System.out.println(n1 / n2);
                case '%' -> System.out.println(n1 % n2);
                default -> System.out.println("Wrong input");
            }
        }catch (Exception e){
            System.out.println("Wrong input");
        }

    }
}
