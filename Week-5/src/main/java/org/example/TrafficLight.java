package org.example;

public enum TrafficLight {
    GREEN(30,"Go"),
    RED(30,"Stop"),
    YELLOW(5,"prepare to stop");

    TrafficLight(int duration, String instruction) {
        this.duration=duration;
        this.instruction=instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public int getDuration() {
        return duration;
    }

    private String instruction;
    private int duration;
}
