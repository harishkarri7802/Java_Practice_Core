
//Create a program that swaps the values of two variables using a temporary variable.

public class Week1_12 {

    public static void main(String[] args) {

        int n1 =10;
        int n2=20;


        System.out.println("Before swapping ....");
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);

        int temp = n1;
        n1= n2;
        n2= temp ;

        System.out.println("After swapping ....");
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);
    }

}
