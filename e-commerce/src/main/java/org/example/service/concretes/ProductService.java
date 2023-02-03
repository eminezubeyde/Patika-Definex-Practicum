package org.example.service.concretes;

import org.example.dao.concretes.ProductDao;
import org.example.model.Product;
import org.example.service.abstracts.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    static ProductDao productDao = new ProductDao();

    @Override
    public void add(Product product) {
        productDao.add(product);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);

    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public void addAll(List<Product> productList) {
        productDao.addAll(productList);
    }
}
