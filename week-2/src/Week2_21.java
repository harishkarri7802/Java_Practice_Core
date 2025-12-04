//Create a class with a final method and try to override it in a subclass (compile-time error).


class GlobalBank{

    public final void payprocess(){
        System.out.println("payment processs is going on .................");
    }

}

class HDFC extends GlobalBank{
//    public final void payprocess(){
//        System.out.println("payment processs is going on .................");
//    }

}

public class Week2_21 {

    public static void main(String[] args) {

        HDFC payment = new HDFC();
        payment.payprocess();


    }
}
