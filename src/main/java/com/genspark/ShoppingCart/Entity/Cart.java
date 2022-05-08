package com.genspark.ShoppingCart.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    private List<Product> products = new ArrayList<>();

    private float totalPrice;

    public Cart() {
        totalPrice = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", products=" + products +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
