package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> productList=new ArrayList<>();
    private Invoice invoice;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", invoice=" + invoice +
                '}';
    }
}
