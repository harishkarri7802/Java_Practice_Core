//Create a program that swaps the values of two variables without using a third variable.

public class Week1_07 {

    public static void main(String[] args) {
        int n1 =10;
        int n2 =20;

        System.out.println("Before swapping the numbers are : ");
        System.out.println("a : " + n1);
        System.out.println("b : " + n2);

        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;

        System.out.println("After swapping the numbers are : ");
        System.out.println("a : " + n1);
        System.out.println("b : " + n2);

    }

}
