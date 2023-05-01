package com.Store.repo;

import com.Store.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreCartItemRepo extends JpaRepository<CartItem, Long> {}
