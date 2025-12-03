//Write a program that calculates and prints the area and perimeter of a rectangle based on the length and width provided by the user.


import java.util.Scanner;

class Rectangle{
    public static Scanner sc = new Scanner(System.in);
    public static void calculateAreaAndParimeter(){

        System.out.println("Enter the length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width : ");
        double width = sc.nextDouble();

        System.out.println("area of rectangle : " + (length * width));
        System.out.println("perimeter of rectangle : " + ( 2 * (length + width)));



    }


}



public class Week1_13 {

    public static void main(String[] args) {
        Rectangle.calculateAreaAndParimeter();
    }
}
