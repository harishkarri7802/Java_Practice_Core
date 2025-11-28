//Write a program that calculates the simple interest based on principal, rate, and time entered by the user.

import java.util.Scanner;

class CalculateSimppleInterest{
    private static Scanner sc = new Scanner(System.in);

    public static double getSimpleInterest(double principal,double rate,double time){

        return (principal*rate*time)/100;
    }

    public static void inputFromUser(){
         while(true){
             System.out.println("Enter the principal amount : " );
             double principal = sc.nextDouble();

             System.out.println("Enter the rate : ");
             double rate = sc.nextDouble();

             System.out.println("Enter the time interval : ");
             double time  = sc.nextDouble();

             System.out.println("simple interest is : " + getSimpleInterest(principal,rate,time));

             System.out.println("Do you want to continue if Yes. then press y");

             String res = sc.next();

             if(res.equalsIgnoreCase("y")){
                 continue;
             }else{
                 break;
             }
         }
    }
}

public class Week1_05 {
    public static void main(String[] args) {

        CalculateSimppleInterest.inputFromUser();

    }
}
