package com.pratap.ecommerce.dao;

import com.pratap.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:5600/")
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Query method to fetch products by their category
    Page<Product> findByProductCategoryId(@RequestParam("id") Long id, Pageable pageable);
}
