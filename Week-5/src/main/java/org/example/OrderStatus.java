package org.example;

public enum OrderStatus {
    PENDING("PENDING","order has been placed and is waiting for prrocess"),
    PROCESSING("PROCESSING","order is being preparing "),
    SHIPPED("SHIPPED","order has being dispatch "),
    CANCELLED("CANCELLED","order has been canceled"),
    DELIVERED("DELIVERED","order has been delivered");
    private String displayName;
    private String description;

    OrderStatus(String status, String message) {
        this.displayName = status;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplayName() {
        return this.displayName;
    }



    public boolean transferOnestatusToAnother(OrderStatus orderStatus,OrderStatus currentStatus){
        if (orderStatus==null) throw new IllegalArgumentException("status cannot be null");
        switch (currentStatus){
            case PENDING -> {
                return orderStatus==PROCESSING || orderStatus==CANCELLED;
            }
            case PROCESSING -> {
                return orderStatus==SHIPPED || orderStatus==CANCELLED;
            }
            case SHIPPED -> {
                return orderStatus==DELIVERED || orderStatus==CANCELLED;
            }
            case CANCELLED -> {
                return false;
            }
            default -> {
                return false;
            }
        }
    }
}
