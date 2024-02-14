package com.ecommerce.springboot.controller;

import com.ecommerce.springboot.service.ClientService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    ClientService serviceC;

    public ClientController(ClientService serviceC) {
        this.serviceC = serviceC;
    }

}
