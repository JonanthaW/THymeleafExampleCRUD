package com.JonanthaW.ProductList.Repository;

import com.JonanthaW.ProductList.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
