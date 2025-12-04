import java.util.Scanner;

//Write a program to parse a boolean from a String using the Boolean wrapper class.
public class Week2_05 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String trueString = Common.getValidBooleanString("Enter the string : ");
        boolean trueValue = Boolean.parseBoolean(trueString);
        System.out.println("trueValue : " + trueValue);


    }

}
