package org.example.dao.concretes;

import org.example.dao.abstracts.ICustomerDao;
import org.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao implements ICustomerDao {

    List<Customer> customerList = new ArrayList<>();

    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public void addAll(List<Customer> customers) {
        customerList.addAll(customers);

    }


}
