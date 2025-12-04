package org.example;

public enum DaysOfWeek {
    MONDAY("MONDAY",false),
    TUESDAY("TUESDAY",false),
    WEDNESDAY("WEDNESDAY",false),
    THURSDAY("THURDAY",false),
    FRIDAY("FRIDAY",false),
    SATURDAY("SATURDAY",true),
    SUNDAY("SUNDAY",true);

    public String getDay() {
        return day;
    }

    private boolean isWeekend;
    private String day;
    DaysOfWeek(String day,boolean isWeekend) {
        this.isWeekend=isWeekend;
        this.day = day;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}


