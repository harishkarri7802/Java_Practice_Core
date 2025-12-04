package org.example;

//Implement an enum representing different user roles (Admin, User, Guest) and their associated permissions.
public class Week05_09 {
    public static void main(String[] args) {
      UserRole user = UserRole.USER;
      user.printPermission();
        System.out.println(user + "has delete perssion : " + user.hasPermission("Write"));
    }
}
