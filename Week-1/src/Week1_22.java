//Create a program that performs basic arithmetic operations (addition, subtraction, multiplication, division) based on user input. The program should accept two numbers and an operator (+, -, *, /) and then display the result.


import java.util.Scanner;

class Calculator{

    static Scanner sc = new Scanner(System.in);

    public static void calculate(){

        while(true){



            System.out.println(" Enter number 1 : ");
            int number1 = sc.nextInt();

            System.out.println(" Enter number 2 : ");
            int number2 = sc.nextInt();

            System.out.println("choose your option ");
            System.out.println("+");
            System.out.println("-");
            System.out.println("/");
            System.out.println("*");

            String option = sc.next();
            System.out.println();

            switch (option){
                case "+":
                    System.out.println("addition : " + (number1+number2));
                    break;
                case "-":
                    System.out.println("substration : " + (number1-number2));
                    break;
                case "/":
                    System.out.println("division : " + (number1/number2));
                    break;
                case "*":
                    System.out.println("Multiplicastion : " + (number1*number2));
                    break;
                default:
                    System.out.println("invalid.........");
            }
        }

    }


}



public class Week1_22 {


    public static void main(String[] args) {

        Calculator.calculate();



    }

}
