package org.example.dao.abstracts;

import org.example.model.Order;

import java.util.List;

public interface IOrderDao {
    void add(Order order);

    void delete(Order order);

    List<Order> getAll();

}
