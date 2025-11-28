//Create a program that converts a given number of minutes into hours and remaining minutes.


import java.util.Scanner;

public class Week1_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the minutes : ");
        int totalMinutes = sc.nextInt();

        int hours = totalMinutes / 60;
        System.out.println(" hours : " + hours);

        int minutes = totalMinutes % 60;
        System.out.println("minutes : " + minutes);





    }

}
