package org.example;

public class Order {
    private String orderId;
    private OrderStatus orderStatus;

    Order(String orderId){
        this.orderId=orderId;
        this.orderStatus= OrderStatus.PENDING;
    }

    public void orderProcessing(OrderStatus orderStatus){
          if (orderStatus.transferOnestatusToAnother(orderStatus,this.getStatus())){
              System.out.println("order status is update from " + this.orderStatus+" to " + orderStatus);
          }else {
              System.out.println("Invalid...");
          }
    }
    public OrderStatus getStatus(){
        return orderStatus;
    }
}
