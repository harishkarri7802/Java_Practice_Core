//Demonstrate the use of static blocks for initializing static variables.

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class DbConnection{
    private static Properties properties = new Properties();
    private static InputStream input =null ;
    static {

        try {
            input = DbConnection.class.getClassLoader().getResourceAsStream("application.properties");


            if (input == null) {
                throw new RuntimeException("Properties file 'application.properties' not found in classpath!");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            System.out.println("Message : " + e.getMessage());
        }
    }

    private static void validatePropertyKey(String key) {
        if (properties.getProperty(key) == null || properties.getProperty(key).isEmpty()) {
            throw new RuntimeException("Missing required key in properties file: " + key);
        }
    }


    public static String getPropertyValue(String key) {
        String value = properties.getProperty(key);

        if (value == null) {
            throw new RuntimeException("Invalid key requested: " + key);
        }

        return value.trim();
    }

}


public class Week2_14 {
    public static void main(String[] args) {

        String username = DbConnection.getPropertyValue("db.username");
        System.out.println(username);

    }
}
