import java.util.Scanner;

//Simple Write a program that takes two integers as input and prints their difference, product, and quotient.

public class Week1_03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the First Number : " );
        int numberOne = sc.nextInt();

        System.out.println("Enter the Secound Number : ");
        int numberTwo = sc.nextInt();

        System.out.println("difference of two numbers are " + (numberOne-numberTwo));
        System.out.println("product of two numbers are " + (numberOne * numberTwo));
        System.out.println("quotient is : " + (numberOne/numberTwo));

    }

}
