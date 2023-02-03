package org.example.instance;

import org.example.service.concretes.ProductService;

public class ProductServiceInstance {
    private static final ProductService instance = new ProductService();

    private ProductServiceInstance() {
    }

    public static ProductService getInstance() {
        return instance;
    }
}
