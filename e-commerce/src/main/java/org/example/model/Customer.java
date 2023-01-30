package org.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long id;
    private String name;
    private String username;
    private String password;
    private Address address;
    private LocalDateTime creationDate;
    private List<Order> orderList=new ArrayList<>();

    public Customer() {
    }

    public Customer(long id, String name, String username, String password, Address address,LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.creationDate = creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.username = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        String value="";
        value+="  id =" +this.id;
        value+="  creationDate =" +this.creationDate;
        value+="  name =" +this.name;
        value+="  username =" +this.username;
        value+="  username =" +this.username;
        value+="  address =" +this.address;
        value+="  orderList =" +this.orderList ;
        return value;
    }
}
