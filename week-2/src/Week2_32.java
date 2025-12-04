
//Create a class with a default constructor and an overloaded constructor.


class Product{
    private String productName;
    private Integer productPrice;
    private String productCategory;
    private Integer productStockQuantity;
    private String description;

    public Product(String productName, Integer productPrice, String productCategory, Integer productStockQuantity, String description) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productStockQuantity = productStockQuantity;
        this.description = description;
    }

    public Product(String productName) {
//        this.productName = productName;
        this(productName,0, " ",0, " ");
    }

    public Product(String productName, Integer productPrice) {
        this(productName,productPrice, " ",0, " ");
    }

    Product(){
        this(" ",0, " ",0, " ");
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                ", productStockQuantity=" + productStockQuantity +
                ", description='" + description + '\'' +
                '}';
    }
}


public class Week2_32 {

    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product);

        Product loptop = new Product(Common.getValidString("Enter the Product name : "),
                Common.getValidInteger("Enter the product price : "),
                Common.getValidString("Enter product category : ") ,
                Common.getValidInteger("Enter the product stock : "),
                Common.getValidString("Enter the product description : "));

        System.out.println(loptop);

    }




}
