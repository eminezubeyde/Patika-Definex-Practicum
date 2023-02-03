package org.example.service.concretes;

import org.example.dao.concretes.Orderdao;
import org.example.model.Order;
import org.example.service.abstracts.IOrderService;

import java.util.List;

public class OrderService implements IOrderService {
    static Orderdao orderdao = new Orderdao();


    @Override
    public void add(Order order) {
        orderdao.add(order);
    }

    @Override
    public void delete(Order order) {
        orderdao.delete(order);

    }

    @Override
    public List<Order> getAll() {
        return orderdao.getAll();
    }
}
