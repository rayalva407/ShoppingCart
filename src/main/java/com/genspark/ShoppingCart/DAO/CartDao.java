package com.genspark.ShoppingCart.DAO;

import com.genspark.ShoppingCart.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDao extends JpaRepository<Cart, Integer> {
}
