//Compare two primitive data types using their corresponding wrapper class equals() method.

import java.util.Scanner;

public class Week2_06 {

    public static void compateTwoPriValues(){
        int a = Common.getValidInteger("Enter the number 1 : ");
        int b = Common.getValidInteger("Enter the number 2 : ");
        Integer c = a;
        Integer d = b;
        System.out.println(c.equals(d));
        System.out.println(d.equals(a));

    }

    public static void main(String[] args) {
        compateTwoPriValues();
    }
}
