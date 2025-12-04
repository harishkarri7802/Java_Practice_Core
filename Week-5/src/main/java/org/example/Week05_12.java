package org.example;

//Write an enum to represent various traffic light signals and their durations.
public class Week05_12 {
    public static void main(String[] args) {
      TrafficLight light = TrafficLight.GREEN;
        System.out.println(light + " light instruction : " + light.getInstruction());
        System.out.println(light + " light duration : " + light.getDuration());
    }
}
