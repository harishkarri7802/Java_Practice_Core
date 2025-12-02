package org.example;
import java.util.Scanner;

public class Common {
    public static double getValidDouble(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine();
            if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Error: Please enter a valid decimal number!");
                continue;
            }
            return Double.parseDouble(input);
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static String getValidBooleanString(String message ){
        while(true){
            try {
                System.out.println(message);
                String input  = sc.nextLine();
                if (!input.matches("[a-zA-Z ]+")) {
                    throw new CustomException("numbers are not  allowed!");
                }
                return input.trim();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static int getValidInteger(String message) {
        while (true) {
            try {
                System.out.println(message);

                String input = sc.next();

                if (!input.matches("-?\\d+")) {
                    throw new CustomException("Only integers allowed!");
                }
                return Integer.parseInt(input);
            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
    public static String getStringNumbers(String message){
        while (true) {
            try {
                System.out.println(message);
                String data = sc.nextLine();
                if (data.matches("[a-zA-Z ]+")) {
                    throw new CustomException("Only numbers  allowed!");
                }
                return data.trim();
            } catch (CustomException e) {
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
//                 sc.next();
                if (!data.matches("[a-zA-Z ]+")) {
                    throw new CustomException("Only alphabets allowed!");
                }
                return data.trim();
            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }

    public static String getValidDelemiter(String message){
        while (true) {
            try {
                System.out.println(message);
                String data = sc.next();
//                 sc.next();
                if (!data.matches("[a-zA-Z ]+")) {
                    System.out.println("a");
                    throw new CustomException("Only special character (delimiter) allowed!");
                }
                if(!data.matches("[0-9]+")){
                    System.out.println("9");
                    throw new CustomException("Only special character (delimiter) allowed!");
                }
                return data;
            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }


    public static char getValidCharacter(String message) {
        while (true) {
            try {
                System.out.println(message);
                String data = sc.next();
//                 sc.next();
                if (!data.matches("[a-zA-Z ]+")) {
                    throw new CustomException("Only alphabets allowed!");
                }
                return data.charAt(0);
            } catch (CustomException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}




