import java.util.Scanner;

class Calculator {



    public static void calculate() {

        while (true) {


            System.out.println("1. Addition");
            System.out.println("2. Division");
            System.out.println("3. Multiplication");
            System.out.println("4. Subtraction");
            System.out.println("5. Square root");
            System.out.println("6. Power calculation");
            System.out.println("7. Generate random number");
            System.out.println("8. Exit");


            int option = Common.getValidInteger("Please Select your option: ");

            switch (option) {

                case 1:
                    int a1 = Common.getValidInteger("Enter first number: ");
                    int b1 = Common.getValidInteger("Enter second number: ");
                    System.out.println("Result = " + (a1 + b1));
                    break;

                case 2:
                    int x = Common.getValidInteger("Enter numerator: ");
                    int y = Common.getValidInteger("Enter denominator: ");

                    try {
                        System.out.println("Result = " + (x/y));
                    }catch (ArithmeticException a){
                        System.out.println("Error: Cannot divide by zero!");
                    } catch (Exception e) {
                        System.out.println("something went wrong.........");;
                    }
                    break;

                case 3:
                    int a2 = Common.getValidInteger("Enter first number: ");
                    int b2 = Common.getValidInteger("Enter second number: ");
                    System.out.println("Result = " + (a2 * b2));
                    break;

                case 4:
                    int a3 = Common.getValidInteger("Enter first number: ");
                    int b3 = Common.getValidInteger("Enter second number: ");
                    System.out.println("Result = " + (a3 - b3));
                    break;

                case 5:
                    int num = Common.getValidInteger("Enter number: ");
                    if (num < 0) {
                        System.out.println("Error: Cannot find square root of negative number!");
                    } else {
                        System.out.println("Square root = " + Math.sqrt(num));
                    }
                    break;

                case 6:
                    int base = Common.getValidInteger("Enter base number: ");
                    int pow = Common.getValidInteger("Enter power: ");
                    System.out.println("Result = " + Math.pow(base, pow));
                    break;

                case 7:

                    double random = Math.random() * 100;
                    System.out.println("Random number (0-100): " + String.format("%.2f", random));
                    break;

                case 8:
                    System.out.println("Exiting calculator...");
                    return;

                default:
                    System.out.println("Invalid option! Please choose between 1-8.");
            }
        }
    }

    public static void main(String[] args) {
        calculate();
    }
}
