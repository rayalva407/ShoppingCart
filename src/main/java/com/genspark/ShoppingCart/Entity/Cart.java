package com.genspark.ShoppingCart.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {


    @Id
    @GeneratedValue
    private int id;

    @OneToMany
    private List<Product> products = new ArrayList<>();

    private float totalPrice;

    public Cart() {
    }

    public Cart(int id) {
        this.id = id;
    }
}
