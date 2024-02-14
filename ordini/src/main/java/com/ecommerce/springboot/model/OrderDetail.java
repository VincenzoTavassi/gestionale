package com.ecommerce.springboot.model;

import jakarta.persistence.*;

public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false)
   private  Order order;

    //@ManyToOne
    // @JoinColumn(name = "product_id",nullable = false)
    //Product prodotto;

    @Column(nullable = false)
    private   int quantity;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
