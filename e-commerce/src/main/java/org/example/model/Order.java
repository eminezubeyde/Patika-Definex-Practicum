package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order extends BaseModel {
    private List<Product> productList = new ArrayList<>();
    private Invoice invoice;

    @Override
    public String toString() {
        return "Order{" +
                ", productList=" + productList +
                ", invoice=" + invoice +
                '}';
    }
}
