
class Vehicle {

    private String brand;
    private int year;


    public Vehicle() {
        this("Unknown", 0);
        System.out.println("Vehicle() Constructor Called");
    }


    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle(String, int) Constructor Called");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}

class Car extends Vehicle {

    private String model;

    // Default Constructor
    public Car() {
        this("Unknown Model");
        System.out.println("Car() Constructor Called");
    }

    public Car(String model) {
        super("Toyota", 2025);
        this.model = model;
        System.out.println("Car(String) Constructor Called");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}



public class Week2_36 {
    public static void main(String[] args) {
        System.out.println("Creating Car Object with Default Constructor");
        Car car1 = new Car();
        System.out.println(car1);

        System.out.println("\nCreating Car Object with Parameterized Constructor");
        Car car2 = new Car("Fortuner");
        System.out.println(car2);

    }
}
