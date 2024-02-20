package com.ecommerce.springboot.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //@JsonBackReference
    // @ManyToOne
    // @JoinColumn(nullable = false)
    //private Client cliente;


    @Column(nullable = false)
    private Date orderdate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
}
