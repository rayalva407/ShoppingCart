package com.genspark.ShoppingCart.Service;

import com.genspark.ShoppingCart.DAO.ProductDao;
import com.genspark.ShoppingCart.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts() {
        return productDao.findAll();
    }

    @Override
    public Product getProduct(int productId) {
        Optional<Product> p = this.productDao.findById(productId);
        Product  product = null;
        if (p.isPresent()) {
            product = p.get();
        }
        else {
            throw new RuntimeException("Product not found for id: " + productId);
        }
        return product;
    }

    @Override
    public Product addProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public String deleteProduct(int productId) {
        this.productDao.deleteById(productId);
        return "Deleted Successfully";
    }
}
