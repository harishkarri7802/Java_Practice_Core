//Sum of Digits: Create a program that calculates the sum of the digits of a given integer.

class SumOfDigits{

}


public class Week1_18 {

    public static void main(String[] args) {

        int number =132;
        int sum =0;

        while(number>0){

            sum = sum + number % 10;
            number/=10;
            System.out.println(sum);

        }

        System.out.println(sum);






    }
}
