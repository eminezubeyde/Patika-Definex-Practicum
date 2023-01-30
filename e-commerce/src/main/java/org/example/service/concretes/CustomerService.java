package org.example.service.concretes;

import org.example.dao.concretes.CustomerDao;
import org.example.model.Customer;
import org.example.service.abstracts.ICustomerService;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService implements ICustomerService {
    static CustomerDao customerDao=new CustomerDao();

    @Override
    public void add(Customer customer) {
        customerDao.add(customer);

    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public void addAll(List<Customer> customers) {
        customerDao.addAll(customers);
    }

    @Override
    public void printAllCustomer(List<Customer> customers) {
        customers.forEach(System.out::println);
    }

    @Override
    public List<Customer> getCustomersByLetter(char letter) {
     return   customerDao.getAll().stream().
             filter(customer -> customer.getName().contains(String.valueOf(letter)))
             .collect(Collectors.toList());
    }
}
