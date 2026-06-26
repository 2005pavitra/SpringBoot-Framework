package org.example;

import org.example.Notifications.EmailNotification;

public class Main {
    public static void main(String[] args) {
//        NotificationService notification = new NotificationService();
//        OrderService order = new OrderService(notification);
        EmailNotification email = new EmailNotification();
        OrderService order = new OrderService(email);
        order.setNotification(email);
        order.placeOrder();

    }
}