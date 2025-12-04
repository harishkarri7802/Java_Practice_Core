//Create a class with a copy constructor that copies the values from one object to another.

class Customer {

    private final int id;
    private final String name;
    private final Address address;

    public Customer(int id, String name, Address address) {
        if (name == null || address == null) {
            throw new IllegalArgumentException("Name and Address cannot be null");
        }
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer(Customer other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy null Employee");
        }
        this.id = other.id;
        this.name = other.name;
        this.address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}



class Address {
    private final String city;
    private final String state;

    public Address(String city, String state) {
        if (city == null || state == null) {
            throw new IllegalArgumentException("City and State cannot be null");
        }
        this.city = city;
        this.state = state;
    }

    // Copy Constructor
    public Address(Address other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy null Address");
        }
        this.city = other.city;
        this.state = other.state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}


public class Week2_35 {
    public static void main(String[] args) {

        Address addr = new Address(Common.getValidString("Enter your city : "), Common.getValidString("Enter your state : "));
        Customer emp1 = new Customer(Common.getValidInteger("Enter your id : "), Common.getValidString("Enter your name  : "), addr);


        Customer emp2 = new Customer(emp1);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}

