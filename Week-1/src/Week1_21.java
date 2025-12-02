
//Write a program to calculate the area of a triangle given the base and height using the formula Area = (base * height) / 2.

import java.util.Scanner;

class Triangle{

    private static Scanner sc = new Scanner(System.in);

    public static void calculateAreaOfTriangle(){

        System.out.println("Enter the base : ");
        double base = sc.nextDouble();
        System.out.println("Enter the height : ");
        double height = sc.nextDouble();

        double area =( (0.33) * (base * height)) ;
        System.out.println("Area of Triangle : " + area);

    }


}



public class Week1_21 {

    public static void main(String[] args) {
        Triangle.calculateAreaOfTriangle();
    }
}
