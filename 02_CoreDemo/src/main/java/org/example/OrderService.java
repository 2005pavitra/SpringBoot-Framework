package org.example;
//import org.example.Notifications.EmailNotification;
import org.example.Notifications.NotificationService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("Order placed");
        notification.sendNotification();

    }

    public void setNotification(NotificationService notification){
        this.notification = notification;
    }
}
