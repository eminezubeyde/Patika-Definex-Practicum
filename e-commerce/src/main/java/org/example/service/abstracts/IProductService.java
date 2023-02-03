package org.example.service.abstracts;

import org.example.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    void delete(Product product);

    List<Product> getAll();

    void addAll(List<Product> productList);
}

