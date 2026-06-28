package com.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    private PaymentService payment = new PaymentService();
//    public OrderService(PaymentService payment){
//        this.payment = payment;
//    }
    public void placeOrder(){
//        payment.pay();
        System.out.println("Order placed");
    }

}
