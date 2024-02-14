package com.ecommerce.springboot.serviceimpl;

import com.ecommerce.springboot.model.OrderDetail;
import com.ecommerce.springboot.repository.OrdineDetailRepository;
import com.ecommerce.springboot.repository.OrdineRepository;
import com.ecommerce.springboot.service.OrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdineDetailServiceImpl implements OrderDetailService {


    private OrdineDetailRepository repoOD;
    private OrdineRepository repoO;

    public OrdineDetailServiceImpl(OrdineDetailRepository repoOD, OrdineRepository repoO) {
        this.repoOD = repoOD;
        this.repoO = repoO;
    }

    @Override
    public void aggiuntaOrderDetail(OrderDetail orderDetail, long id) {

    }

    @Override
    public OrderDetail getByID(long id) {
        return null;
    }

    @Override
    public List<OrderDetail> getAll() {
        return null;
    }

    @Override
    public void modificaTotale(OrderDetail orderDetail) {

    }

    @Override
    public void modificaParziale(int quantita, long id) {

    }

    @Override
    public void elimina(long id) {

    }
}
