package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long id;
    private String name;
    private String username;
    private String password;
    private Address address;
    private List<Order> orderList=new ArrayList<>();
}
