package com.Store.model;

import com.Store.repo.StoreProductRepo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private int quantity;

    public CartItem() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct(StoreProductRepo productRepo) {
        return productRepo.findById(productId).orElse(null);
    }

    public CartItem(Long productId, int quantity, Product product) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
