package com.genspark.ShoppingCart.DAO;

import com.genspark.ShoppingCart.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
}
