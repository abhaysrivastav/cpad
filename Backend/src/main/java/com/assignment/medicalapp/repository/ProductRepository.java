package com.assignment.medicalapp.repository;

import com.assignment.medicalapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

    @Query(value = "SELECT * FROM products p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<Product> searchProductsSQL(String query);
}
