package com.ecommerce.springboot.repository;

import com.ecommerce.springboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    //private OrdineRepository repoO;



}
