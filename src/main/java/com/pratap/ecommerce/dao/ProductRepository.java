package com.pratap.ecommerce.dao;

import com.pratap.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:5600/")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
