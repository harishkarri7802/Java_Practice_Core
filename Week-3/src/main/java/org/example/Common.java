package org.example;

import java.util.Scanner;

public class Common {
    public static final Scanner sc = new Scanner(System.in);
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

}
