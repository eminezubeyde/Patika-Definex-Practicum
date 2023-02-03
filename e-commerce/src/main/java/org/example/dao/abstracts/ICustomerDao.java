package org.example.dao.abstracts;

import org.example.model.Customer;

import java.util.List;

public interface ICustomerDao {

    void add(Customer customer);

    List<Customer> getAll();

    void addAll(List<Customer> customerList);

    Customer getCustomerByUsername(String username);
}
