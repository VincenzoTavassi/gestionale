package com.ecommerce.springboot.contoller;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrdineController {

    OrderService orderO;

    public OrdineController(OrderService orderO) {
        this.orderO = orderO;
    }
}
