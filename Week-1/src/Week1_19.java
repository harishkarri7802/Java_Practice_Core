//Write a program to calculate the roots of a quadratic equation (ax^2 + bx + c = 0) using the quadratic formula.

import java.util.Scanner;

class QuadraticEquation{

    private static Scanner sc = new Scanner(System.in);

    public static void calculate(){

        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();

        int d =( b*b ) - (4 * a*c) ;
        System.out.println(d);

        if(d>0){

            double root1 = (-b - (Math.sqrt(d)))/ (2*a);

            double root2 = ( - b + Math.sqrt(d))/(2*a);
            System.out.println("root1 : " + root1);
            System.out.println("root2 : " + root2);

        }else if(d==0){

            double root= -b/(2*a);
            System.out.println("root : " + root);

        }else{

            double real = -b/(2*a);
            System.out.println("root : " + real);

            double imaginary = Math.sqrt(d)/(2*a);

            System.out.println("real : " + real);
            System.out.println("imaginary : " + imaginary);
        }




    }


}


public class Week1_19 {

    public static void main(String[] args) {

        QuadraticEquation.calculate();

    }

}
