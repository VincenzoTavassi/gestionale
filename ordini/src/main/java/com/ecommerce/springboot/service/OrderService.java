package com.ecommerce.springboot.service;

import com.ecommerce.springboot.model.Order;
import com.ecommerce.springboot.model.OrderDetail;

import java.util.Date;
import java.util.List;

public interface OrderService {
    public void aggiuntaOrderDetail(Order order, long id);

    public Order getByID(long id);

    public List<Order> getAll();

    public void modificaTotale(Order order);

    public void modificaParziale(Date orderDate);

    public void elimina(long id);

    public List<Order> ordiniByUtente(long id_utente);
}
