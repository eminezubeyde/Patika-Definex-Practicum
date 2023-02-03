package org.example.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Invoice {
    private int total;
    private String company;
    private String sector;
    private LocalDateTime createdDate;
    private Customer customer;


    @Override
    public String toString() {
        return "Invoice{" +
                "customer=" + customer.getName() +
                ", total=" + total +
                '}';
    }
}
