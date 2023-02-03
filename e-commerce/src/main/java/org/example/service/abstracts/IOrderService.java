package org.example.service.abstracts;

import org.example.model.Order;

import java.util.List;

public interface IOrderService {
    void add(Order order);

    void delete(Order order);

    List<Order> getAll();
}