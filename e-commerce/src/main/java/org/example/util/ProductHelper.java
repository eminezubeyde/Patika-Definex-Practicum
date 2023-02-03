package org.example.util;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductHelper {

    public static List<Product> createProductList() {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setName("Product " + (i + 1));
            product.setCategory("ELEKTRONIK");
            product.setId((long) i);
            product.setPrice(100 * (i + 1));
            product.setStock(i + 1);
            products.add(product);
        }
        return products;
    }
}
