//Write a program that converts temperatures from Celsius to Fahrenheit and vice versa.

import java.util.Scanner;

class CelsiusAndFahrenhit{

    private static Scanner sc = new Scanner(System.in);

    public static void convertCelsiusToFahrenhit(){

        System.out.println(" Enter the Celsius : ");
        double celsius = sc.nextDouble();

        double fahrenhit = (celsius * (1.8) )+ 32;

        System.out.println("Celsius To Fahrenhit : " + fahrenhit );

    }

    public static void convertFahrenhitTOCelsius(){
        System.out.println(" Enter the Fahrenhit : ");
        double fahrenhit = sc.nextDouble();

        double celsius = (fahrenhit - 32) * (0.55) ;

        System.out.println(celsius);
    }



}


public class Week1_06 {



}
