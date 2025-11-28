//Write a program to calculate the Body Mass Index (BMI) given the height (in meters) and weight (in kilograms) of a person. The formula for BMI is BMI = weight / (height * height).

import java.util.Scanner;

class BodyMassIndex{
    private static Scanner sc = new Scanner(System.in);

    public static void calculateBMI(){

        System.out.println("Enter the height of a person (in meters) : ");
        double height  = sc.nextDouble();

        System.out.println("Enter the weight of a person (in kilogram) :  ");
        double weight  = sc.nextDouble();

        double bmi= weight /(height * height);
        System.out.println("BMI of a person is  : " + (bmi));
    }
}



public class Week1_15 {

    public static void main(String[] args) {

        BodyMassIndex.calculateBMI();


    }

}
