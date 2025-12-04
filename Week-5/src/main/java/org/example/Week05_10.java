package org.example;

//Use an enum to represent different order statuses (Pending, Shipped, Delivered) in an order management system.
public class Week05_10 {
    public static void main(String[] args) {
     Order orderOne  =new Order("order1");
     Order orderTwo = new Order("order2");
     orderTwo.orderProcessing(OrderStatus.PROCESSING);
    }
}
