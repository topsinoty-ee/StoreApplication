package com.Store.controller;

import com.Store.model.CartItem;
import com.Store.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Store.repo.StoreProductRepo;
import com.Store.repo.StoreCartItemRepo;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    private StoreProductRepo storeProductRepo;
    @Autowired
    private StoreCartItemRepo storeCartItemRepo;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return storeProductRepo.findAll();
    }

    @GetMapping("/CartItems")
    public List<CartItem> getCartItems() {
        return storeCartItemRepo.findAll();
    }
}
