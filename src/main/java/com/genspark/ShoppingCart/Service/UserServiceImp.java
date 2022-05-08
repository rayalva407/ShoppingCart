package com.genspark.ShoppingCart.Service;

import com.genspark.ShoppingCart.DAO.UserDao;
import com.genspark.ShoppingCart.Entity.Cart;
import com.genspark.ShoppingCart.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User addUser(String username) {
        User user = new User(username);
        user.setCart(new Cart());
        return userDao.save(user);
    }
}
