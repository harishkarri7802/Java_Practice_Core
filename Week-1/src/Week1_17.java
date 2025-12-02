//Write a program that converts a given number of days into years, weeks, and remaining days.
//365
import java.util.Scanner;

public class Week1_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int totaldays = sc.nextInt();

        int years = totaldays / 365;
        System.out.println("years : " + years);

        int days = totaldays % 365;

        int weeks = days / 7;
        System.out.println("weeks : " + weeks);

        int remainingDays = days % 7;
        System.out.println("remainingDays : " + remainingDays);
    }

}
