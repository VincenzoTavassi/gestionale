package com.ecommerce.springboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity

public class Client {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long clientId;

   // @JsonManagedReference
 //@OneToMany(mappedBy = "cliente")  //join ordine cliente
    //
    //
    //
    // private List<Order> order;



    @Column(nullable = false)
 private String clientName;


    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;


@Column(nullable = false)
private int cap;

    @Column(nullable = false)
    private String country;

    public Client(String clientName, String address, String city, int cap, String country) {
        this.clientName = clientName;
        this.address = address;
        this.city = city;
        this.cap = cap;
        this.country = country;
    }

    public Client(long clientId, String clientName, String address, String city, int cap, String country) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.address = address;
        this.city = city;
        this.cap = cap;
        this.country = country;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Client() {
    }



}
