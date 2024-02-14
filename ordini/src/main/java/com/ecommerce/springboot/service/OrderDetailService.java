package com.ecommerce.springboot.service;

import com.ecommerce.springboot.model.OrderDetail;

import java.util.List;

public interface OrderDetailService {

    public void aggiuntaOrderDetail(OrderDetail orderDetail,long id);
    public OrderDetail getByID(long id);

    public List<OrderDetail> getAll();

    public void modificaTotale(OrderDetail orderDetail);

    public void modificaParziale(int quantita,long id);

    public void elimina(long id);




}
