package com.genspark.ShoppingCart.Controllers;

import com.genspark.ShoppingCart.Entity.Product;
import com.genspark.ShoppingCart.Entity.User;
import com.genspark.ShoppingCart.Service.ProductService;
import com.genspark.ShoppingCart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @PostMapping("/users/{username}")
    public User addUser(@PathVariable String username) {
        return this.userService.addUser(username);
    }

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to your cart!</h1>";
    }

    @GetMapping("/products")
    public List<Product> getCourses() {
        return this.productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable String productId) {
        return this.productService.getProduct(Integer.parseInt(productId));
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return this.productService.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProducts(@PathVariable String productId) {
        return this.productService.deleteProduct(Integer.parseInt(productId));
    }
}
