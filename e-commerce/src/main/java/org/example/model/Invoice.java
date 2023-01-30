package org.example.model;

public class Invoice { //fatura

     private Customer customer;
     private int total;

     public Invoice() {
     }

     public Invoice(Customer customer, int total) {
          this.customer = customer;
          this.total = total;
     }

     public Customer getCustomer() {
          return customer;
     }

     public void setCustomer(Customer customer) {
          this.customer = customer;
     }

     public int getTotal() {
          return total;
     }

     public void setTotal(int total) {
          this.total = total;
     }

     @Override
     public String toString() {
          return "Invoice{" +
                  "customer=" + customer +
                  ", total=" + total +
                  '}';
     }
}
