//Program to demonstrate type casting between primitive data types.

public class Week2_01 {
    public static void main(String[] args) {

        //implicit type casting
        //widening
        int num1 = Common.getValidInteger("Please enter the number : ");
        long num2 = num1;
        System.out.println("int : " + num1 +" long:" + num2);


        float num3 =100.59f;
        double num4 = num3;

        //explicit typecasting

        long num5 = 99;
        int num6 = (int) num5;

        int num7 = 200;
        byte num8 = (byte) num7;

        double num9 = 99.99;
        float num10 =(float) num9;




    }
}
