package org.example.instance;

import org.example.service.concretes.CustomerService;

public class CustomerServiceInstance {
    private static final CustomerService instance=new CustomerService();

    private CustomerServiceInstance() {// newlemeyle nesne oluşturma işleminin yapılmasını engellemek için
    }

    public static CustomerService getInstance() {

        return instance;
    }
}
