import java.util.Scanner;

public class Week2_02 {

    public static void stringOpearation(){

        try {

            String number1 = Common.getStringNumbers("Enter first number : ");
            String number2 = Common.getStringNumbers("Enter second number: ");
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);

            System.out.println("\n--- Arithmetic Results ---");
            System.out.println("Addition       : " + (num1 + num2));
            System.out.println("Subtraction    : " + (num1 - num2));
            System.out.println("Multiplication : " + (num1 * num2));
            if (num2 != 0) {
                System.out.println("Division       : " + (num1 / num2));
                System.out.println("Modulus        : " + (num1 % num2));
            } else {
                System.out.println("Division       : Cannot divide by zero!");
            }
            System.out.println("Square root of " + num1 + ": " + Math.sqrt(num1));
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }


    }


    public static void main(String[] args) {
        stringOpearation();

    }
}

