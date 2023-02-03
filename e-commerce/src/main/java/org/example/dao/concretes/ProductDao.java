package org.example.dao.concretes;

import org.example.dao.abstracts.IProductDao;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao {

    List<Product> productList = new ArrayList<>();


    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);

    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void addAll(List<Product> productList) {
        productList.addAll(productList);
    }
}
