//Convert a character to its ASCII value using the Character wrapper class.

public class Week2_07 {

    public static int getVaue(){
        System.out.println("Enter a Character : ");
        char c = Common.sc.next().charAt(0);
        return Character.getNumericValue(c);
    }


    public static void main(String[] args) {
        System.out.println("ASCII : "+getVaue());
    }
}
