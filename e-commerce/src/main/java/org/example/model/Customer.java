package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseModel {
    private String name;
    private String username;
    private String password;
    private Address address;
    private LocalDateTime creationDate;
    private List<Order> orderList = new ArrayList<>();


    public Customer(String name, String username, String password, LocalDateTime creationDate) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.creationDate = creationDate;
    }


    @Override
    public String toString() {
        String value = "";
        value += "  creationDate =" + this.creationDate;
        value += "  name =" + this.name;
        value += "  username =" + this.username;
        value += "  username =" + this.username;
        value += "  address =" + this.address;
        value += "  orderList =" + this.orderList;
        return value;
    }
}
