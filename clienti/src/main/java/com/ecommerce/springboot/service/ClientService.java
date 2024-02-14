package com.ecommerce.springboot.service;

import com.ecommerce.springboot.model.Client;

import java.util.List;

public interface ClientService {

    public void addClient(Client c);

    public List<Client> getListClient();

    public Client getClient(long id);

    public void partialModClient(String address);

    public void totalModClient(Client c);

    public void deleteClient(long id);

    public List<Client> getClientByName(String name);

    public Client getBestBuyer();





}
