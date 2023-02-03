package org.example.dao.concretes;

import org.example.dao.abstracts.IOrderDao;
import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public class Orderdao implements IOrderDao {
    List<Order> orderList = new ArrayList<>();

    @Override
    public void add(Order order) {
        orderList.add(order);
    }

    @Override
    public void delete(Order order) {
        orderList.remove(order);
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }
}
