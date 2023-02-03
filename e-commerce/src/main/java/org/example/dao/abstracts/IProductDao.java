package org.example.dao.abstracts;

import org.example.model.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);

    void delete(Product product);

    List<Product> getAll();

    void addAll(List<Product> productList);
}
