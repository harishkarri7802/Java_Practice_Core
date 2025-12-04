package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Common {
    public static String getValidStringAndNumber(String message) {
        while (true) {
            try {
                System.out.println(message);
                String data = sc.next();
                if(!data.matches("^[a-zA-z0-9 ]")){
                    throw new IllegalArgumentException("invalid input ");
                }
                return data.trim();
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
     static Scanner sc = new Scanner(System.in);
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

    public static int[] getArrayInputFromUser(){
        System.out.println("Integer Array creation......");
        System.out.println();
        int numberOfElement = Common.getValidInteger("Enter the size of an array : ");
        int array[] = new int[numberOfElement];
        for(int i=0;i<numberOfElement;i++){
            array[i] = Common.getValidInteger("Enter the element " + i +" : ");
        }
        return array;
    }

    public static Integer[] getIntegerArrayInputFromUser(){
        System.out.println("Integer Array creation......");
        System.out.println();
        int numberOfElement = Common.getValidInteger("Enter the size of an array : ");
        Integer array[] = new Integer[numberOfElement];
        for(int i=0;i<numberOfElement;i++){
            array[i] = Common.getValidInteger("Enter the element " + i +" : ");
        }
        return array;
    }

    public static String[] getStringInputFromUser(){
        System.out.println("String Array creation......");
        System.out.println();
        int numberOfElement = Common.getValidInteger("Enter the size of an array : ");
        String array[] = new String[numberOfElement];
        for(int i=0;i<numberOfElement;i++){
            array[i] = Common.getValidString("Enter the element " + i +" : ");
        }
        return array;
    }

    public static ArrayList<Integer> getListIntegerInputFromUser(){
        System.out.println("List Input ");
        ArrayList<Integer> listInteger = new ArrayList<>();
        int size = Common.getValidInteger("Enter the size of List");
        for(int i=0;i<size;i++){
            listInteger.add(Common.getValidInteger("enter the element "+i+" : "));
        }
        listInteger.stream().forEach(e->{
            System.out.println(e);
        });
        return listInteger;
    }
}
