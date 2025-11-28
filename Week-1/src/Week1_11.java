
//Create a program that compares two numbers and prints whether the first is greater, less than, or equal to the second.

public class Week1_11 {

    public static void main(String[] args) {

        int n1=10;
        int n2=20;

//        (n1>n2)?System.out.println(n1 + "is greater than "+n2):((n1<n2)? sout );

        if(n1>n2){
            System.out.println(n1 + "is greater than "+n2);
        }else if(n1==n2){
            System.out.println("n1 is equal to n2");
        }else{
            System.out.println("n2 is greater then n1");
        }
    }
}
