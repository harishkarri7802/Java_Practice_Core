//Demonstrate the difference between equals() and == operator.
public class Week2_11 {

    public static void stringComparition(){

        try{

            String s1=Common.getValidString("Enter a string 1 : ");
            String s2=Common.getValidString("Enter a string 2 : ");
            String s3 =new String(Common.getValidString("Enter a string 3 : "));

            System.out.println(s1.equals(s2));
            System.out.println(s2.equals(s3));
            System.out.println(s1==s2);
            System.out.println(s1==s3);

        }catch (Exception e){
            System.out.println("unexpected event occured.............");
        }

    }


    public static void main(String[] args) {
        stringComparition();
    }
}
