package org.example.instance;

import org.example.service.concretes.OrderService;

public class OrderServiceInstance {
    private static OrderService instance;

    private OrderServiceInstance() {
    }

    public static OrderService getInstance() {
        if (instance == null) {
            instance = new OrderService();
        }
        return instance;
    }

}
