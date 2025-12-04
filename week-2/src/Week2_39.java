//Write a program to create an object using a constructor with default parameters.

import java.util.logging.Level;
import java.util.logging.Logger;

class UserProfile {

    private static final Logger LOGGER = Logger.getLogger(UserProfile.class.getName());

    private String username;
    private String country;
    private int age;


    public UserProfile() {
        this("GuestUser", "Unknown", 0);
        LOGGER.log(Level.FINE,"Guest user is created........");
    }


    public UserProfile(String username) {
        this(username, "India", 18);
    }


    public UserProfile(String username, String country) {
        this(username, country, 18);
    }


    public UserProfile(String username, String country, int age) {
        this.username = username;
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "username='" + username + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }


}

public class Week2_39 {
    public static void main(String[] args) {

        UserProfile userOne = new UserProfile();
        System.out.println(userOne);
        UserProfile userTwo = new UserProfile(Common.getValidString("Enter your name : "));
        System.out.println(userTwo);



    }
}




