package org.example;
//Create a program that uses an enum to represent days of the week and determine if the given day is a weekend.
public class Week05_11 {
    public static void main(String[] args) {
      DaysOfWeek isWeekend = DaysOfWeek.MONDAY;
      if(isWeekend.isWeekend()){
          System.out.println( isWeekend.getDay()+ " is "+ "weekend");
      }else {
          System.out.println( isWeekend.getDay() + " is not a"+ " weekend");
      }
    }

}
