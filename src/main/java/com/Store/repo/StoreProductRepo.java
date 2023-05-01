package com.Store.repo;

import com.Store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreProductRepo extends JpaRepository<Product, Long> {
}
