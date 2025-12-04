//Use Double wrapper class to round a floating-point number to two decimal places.
public class Week2_04 {
    public static void main(String[] args) {


        double price = Common.getValidDouble("Enter the price: ");


        double accuratePrice = Double.parseDouble(String.format("%.2f", price));

        System.out.println("Original Price : " + price);
        System.out.println("Rounded Price  : " + accuratePrice);
    }
}

