package com.ecommerce.springboot.serviceimpl;

import com.ecommerce.springboot.model.Client;
import com.ecommerce.springboot.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public void addClient(Client c) {

    }

    @Override
    public List<Client> getListClient() {
 return null;
    }

    @Override
    public Client getClient(long id) {
        return null;
    }

    @Override
    public void partialModClient(String address) {

    }

    @Override
    public void totalModClient(Client c) {

    }

    @Override
    public void deleteClient(long id) {

    }

    @Override
    public List<Client> getClientByName(String name) {
        return null;
    }

    @Override
    public Client getBestBuyer() {
        return null;
    }
}
