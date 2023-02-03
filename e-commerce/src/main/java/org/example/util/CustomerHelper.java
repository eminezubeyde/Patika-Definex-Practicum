package org.example.util;

import org.example.model.Customer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerHelper {
    static Scanner scanner = new Scanner(System.in);


    public static String getCustomerUsername() {
        System.out.println("musterinin kullanıcı adını giriniz");
        return scanner.next();
    }

    public static Customer createCustomer() {
        System.out.println("müşterinin ismini giriniz");
        String name = scanner.next();
        System.out.println(name + " isimli müşterinin kullanıcı adını giriniz.");
        String username = scanner.next();
        System.out.println(name + " isimli müşteri için şifre giriniz.");
        String password = scanner.next();
        return new Customer(name, username, password, LocalDateTime.now());
    }


    public static List<Customer> createCustomerList() {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Customer customer = new Customer();
            customer.setName("User" + (i + 1));
            customer.setCreationDate(LocalDateTime.now());
            customer.setUsername("Username" + (i + 1));
            customer.setPassword("Password" + (i + 1));
            customers.add(customer);
        }
        return customers;
    }
}
