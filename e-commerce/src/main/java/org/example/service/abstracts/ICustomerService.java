package org.example.service.abstracts;

import org.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);
    List<Customer> getAll();
    void addAll(List<Customer> customers);
    void printAllCustomer(List<Customer> customers);
    List<Customer> getCustomersByLetter(char letter);

    Customer getByUsername(String username);
}
