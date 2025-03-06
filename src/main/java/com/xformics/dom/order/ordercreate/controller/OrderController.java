package com.xformics.dom.order.ordercreate.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xformics.dom.order.ordercreate.model.Order;
import com.xformics.dom.order.ordercreate.service.MessageProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publish")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class OrderController {
    private final MessageProducerService kafkaProducerService;

    public OrderController(MessageProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping
    public String createOrder(@RequestBody String rawJson) throws Exception {
        System.out.println("Raw JSON from UI is: " + rawJson);  // ✅ Logs raw JSON

        ObjectMapper objectMapper = new ObjectMapper();
        Order order = objectMapper.readValue(rawJson, Order.class);

        System.out.println("Mapped Order Object: " + order);  // ✅ Debug converted object
        kafkaProducerService.sendOrder(order);
        return "Order published to Kafka!";
    }
}

