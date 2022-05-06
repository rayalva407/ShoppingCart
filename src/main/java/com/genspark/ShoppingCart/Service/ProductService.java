package com.genspark.ShoppingCart.Service;

import com.genspark.ShoppingCart.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProduct(int productId);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    String deleteProduct(int productId);
}
