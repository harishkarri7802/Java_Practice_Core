//Implement a simple MathUtility class with static methods for common math operations (add, subtract, multiply, divide).

class MathUtility{
    public static void add(double num1,double num2){
        System.out.println(num1+num2);
    }

    public static void sub(double num1,double num2){
        System.out.println(num1-num2);
    }

    public static void div(double num1,double num2){
        System.out.println(num1-num2);
    }

    public static void mul(double num1,double num2){
        System.out.println(num1*num2);
    }

    public static void mod(double num1,double num2){
        System.out.println(num1%num2);
    }

    public static void square(double num1){
        System.out.println(num1*num1);
    }
}


public class Week2_13 {
    public static void main(String[] args) {

        MathUtility.add(Common.getValidDouble("Enter number 1 : "),Common.getValidDouble("Enter number 2 : "));
//        MathUtility.mul(Common.getValidDouble("Enter number 1 : "),Common.getValidDouble("Enter number 2 : "));
//        MathUtility.div(Common.getValidDouble("Enter number 1 : "),Common.getValidDouble("Enter number 2 : "));


    }
}
