import java.util.Scanner;

class AverageCalculation{

    public static Double average(double n1,double n2,double n3){
        return (n1+n2+n3)/3;
    }


}

//Create a program that accepts three numbers as input and calculates their average.
public class Week1_04 {

    public static void getThreeNumbersFromUser(){

        try(Scanner sc  = new Scanner(System.in)){

            System.out.println("Enter Number one : " );
            double numberOne = sc.nextDouble();

            System.out.println("Enter Number two : " );
            double numberTwo = sc.nextDouble();

            System.out.println("Enter Number three : " );
            double numberThree = sc.nextDouble();

            System.out.println("average of three numbers are : " + AverageCalculation.average(numberOne,numberTwo,numberThree));



        }
    }


    public static void main(String[] args) {
        getThreeNumbersFromUser();
    }

}
