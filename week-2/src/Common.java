import pack1.CustomException;

import java.util.Scanner;

public class Common {

    public static final Scanner sc = new Scanner(System.in);

    public static String getValidBooleanString(String message ){
        while(true){

            try {
                System.out.println(message);
                String input  = sc.nextLine();
                if (!input.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("numbers are not  allowed!");
                }
                return input;

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }


    }

    public static String isValidMobile(String message) {
        while (true) {
            System.out.println(message);
            String mobile = sc.nextLine().trim();

            if (mobile.isEmpty()) {
                System.out.println("Mobile number cannot be empty!");
                continue;
            }

            if (!mobile.matches("\\d{10}")) {
                System.out.println("Please enter a valid 10-digit mobile number!");
                continue;
            }

            return mobile;
        }
    }

    public static String isValidEmail(String message) {
        while (true) {
            System.out.println(message);
            String email = sc.nextLine().trim();

            if (email.isEmpty()) {
                System.out.println("Email cannot be empty!");
                continue;
            }

            String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

            if (!email.matches(regex)) {
                System.out.println("Enter a valid Email address!");
                continue;
            }

            return email;
        }
    }

    public static double getValidDouble(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine();
            if(input ==null || input.trim().isEmpty()){
                throw new IllegalArgumentException("field cannot be null ");
            }



            if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Error: Please enter a valid decimal number!");
                continue;
            }

            return Double.parseDouble(input);
        }
    }

    public static int getValidInteger(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = sc.nextLine();
                if(input ==null || input.trim().isEmpty()){
                    throw new IllegalArgumentException("field cannot be null ");
                }

                if (!input.matches("-?\\d+")) {
                    throw new IllegalArgumentException("Only integers allowed!");
                }

                return Integer.parseInt(input);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }


    public static String getValidString(String message) {
        while (true) {
            try {
                System.out.println(message);
                String data = sc.nextLine();

                if(data ==null || data.trim().isEmpty()){
                    throw new IllegalArgumentException("field cannot be null ");
                }

                if (!data.matches("[A-Za-z ]+")) {
                    throw new IllegalArgumentException("Only alphabets allowed!");
                }

                return data;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }

    public static String getStringNumbers(String message) {
        while (true) {
            try {
                System.out.println(message);
                String data = sc.nextLine();

                if (!data.matches("\\d+")) {
                    throw new IllegalArgumentException("Only numbers allowed!");
                }

                return data;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    public static String inputFromUserString(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static int inputFromUserInteger(String message) {
        System.out.println(message);
        return sc.nextInt();
    }
}
