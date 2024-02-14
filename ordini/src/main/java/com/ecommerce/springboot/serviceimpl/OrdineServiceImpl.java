package com.ecommerce.springboot.serviceimpl;

import com.ecommerce.springboot.model.Order;
import com.ecommerce.springboot.repository.OrdineRepository;
import com.ecommerce.springboot.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class OrdineServiceImpl implements OrderService {

  //  private ClientService repoC;

    private OrdineRepository repoO;


   // public OrdineServiceImpl(ClientRepository repoC, OrdineRepository repoO) {
    //    this.repoC = repoC;
     //   this.repoO = repoO;
    //}

    @Override
    public void aggiuntaOrderDetail(Order order, long id) {

    }

    @Override
    public Order getByID(long id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public void modificaTotale(Order order) {

    }

    @Override
    public void modificaParziale(Date orderDate) {

    }

    @Override
    public void elimina(long id) {

    }

    @Override
    public List<Order> ordiniByUtente(long id_utente) {
        return null;
    }
}
