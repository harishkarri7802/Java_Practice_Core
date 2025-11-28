//Write a program that prints "Good Morning," "Good Afternoon," "Good Evening," or "Good Night" based on the current time.


import java.time.LocalTime;

public class Week1_10 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hours = time.getHour();

        if(5>=hours && hours < 12){
            System.out.println("Good Morning......");
        } else if ( 12 >= hours && hours < 16) {
            System.out.println("Good Afternoon......");
        } else if (16 >= hours && hours < 21) {
            System.out.println("Good Evening......");
        }else {
            System.out.println("Good Night.........");
        }


    }

}
