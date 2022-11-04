package com.educative.ecommerce.service;

import com.educative.ecommerce.model.Product;

import java.util.List;

public interface ProductServiceInterface {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
