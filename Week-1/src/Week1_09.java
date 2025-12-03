//Write a program that calculates and prints the area and perimeter of a circle based on the radius provided by the user.

import java.util.Scanner;

class Circle{

    private static final double PI = 3.14;
    private static Scanner sc = new Scanner(System.in);



    public static double getAreaOfCircle(){
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();
        return PI* (radius*2);
    }

    public static double getParimeterOfCircle(){
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();
        return 2 * PI * radius;
    }

}


public class Week1_09 {

    public static void main(String[] args) {

        System.out.println("area of circle : " + Circle.getAreaOfCircle());
        System.out.println("perimeter of circle : " + Circle.getParimeterOfCircle());

    }

}
