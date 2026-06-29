package com.example;


import com.example.payment.CardPayment;
import com.example.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Pavitra",20);
    }

    @Bean
    public CartService createCart(){
        return new CartService();
    }

    @Bean
    public PaymentService card(){
        return new CardPayment();
    }

    public OrderService order(PaymentService payment){
        return new OrderService(payment);
    }
}
