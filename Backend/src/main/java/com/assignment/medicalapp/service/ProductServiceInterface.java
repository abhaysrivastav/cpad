package com.assignment.medicalapp.service;

import java.util.List;
import com.assignment.medicalapp.model.Product;

public interface ProductServiceInterface {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}