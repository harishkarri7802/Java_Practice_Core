//Program to check whether a given number is odd or even using both int and Integer.



import java.util.InputMismatchException;
import java.util.Scanner;

public class Week2_03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            int num1 = Common.getValidInteger("Enter a number (int): ");


            Integer num2 = Common.getValidInteger("Enter a number (Integer): ");

            // Check odd/even for int
            if (num1 % 2 == 0) {
                System.out.println(num1 + " is Even (int)");
            } else {
                System.out.println(num1 + " is Odd (int)");
            }

            // Check odd/even for Integer
            if (num2 % 2 == 0) {
                System.out.println(num2 + " is Even (Integer)");
            } else {
                System.out.println(num2 + " is Odd (Integer)");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer number.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

