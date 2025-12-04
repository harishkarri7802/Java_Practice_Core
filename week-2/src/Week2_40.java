//Implement a constructor in a class that throws a custom exception if invalid data is passed.



class User {

    private final String username;
    private final String email;
    private final int age;

    public User(String username, String email, int age) throws InvalidUserDataException {


        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUserDataException("Username cannot be empty");
        }

        if (!username.matches("^[A-Za-z][A-Za-z0-9_]{2,5}$")) {
            throw new InvalidUserDataException(
                    "Invalid username format: Must start with a letter and be 2–5 characters"
            );
        }

        if (email == null || !email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
            throw new InvalidUserDataException("Invalid email format");
        }

        if (age < 18 || age > 100) {
            throw new InvalidUserDataException("Age must be between 18 and 100");
        }


        this.username = username;
        this.email = email;
        this.age = age;

        System.out.println("User object created successfully!");
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "', age=" + age + "}";
    }
}

public class Week2_40 {

    public static void main(String[] args) {
        try {
            User userOne = new User(Common.inputFromUserString("Enter your name : "),
                    Common.inputFromUserString("Enter your email : "),
                    Common.inputFromUserInteger("Enter your age : "));
            System.out.println(userOne);

        } catch (InvalidUserDataException e) {
            System.out.println("Error creating user: " + e.getMessage());
        }

    }



}

