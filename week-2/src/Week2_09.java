import java.io.UnsupportedEncodingException;

//Create a Byte array from a String and convert it back to a String.
public class Week2_09 {

    public static void stringConvertion(){

      try {
          String name= Common.getValidString("Enter your name : ");
          System.out.println("name : "+name);
          byte[] nameByte= name.getBytes();
          System.out.println("nameByte : "+nameByte);
          String backName = new String(nameByte);
          System.out.println("backName : "+backName);
      }catch (Exception c){
          System.out.println("unexpected event occured.............");
      }
    }
    public static void main(String[] args) {
        stringConvertion();
    }

}
