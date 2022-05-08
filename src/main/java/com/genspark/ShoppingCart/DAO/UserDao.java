package com.genspark.ShoppingCart.DAO;

import com.genspark.ShoppingCart.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}