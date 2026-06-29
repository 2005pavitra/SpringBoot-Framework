package com.example;

import com.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService payment ;

    @Autowired
    public OrderService(@Qualifier("cardPayment") PaymentService payment){
        this.payment = payment;
    }


//    @Autowired
//    public void setPayment(PaymentService payment) {
//        this.payment = payment;
//    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }

}
