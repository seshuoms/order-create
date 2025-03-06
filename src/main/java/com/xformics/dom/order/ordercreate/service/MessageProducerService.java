package com.xformics.dom.order.ordercreate.service;

import com.xformics.dom.order.ordercreate.model.Order;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.cloud.spring.pubsub.core.PubSubTemplate;

@Service
public class MessageProducerService {
    //private final KafkaTemplate<String, String> kafkaTemplate;

    private final PubSubTemplate pubSubTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public MessageProducerService(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    public void sendOrder(Order order) throws Exception {
        String orderJson = objectMapper.writeValueAsString(order);
        System.out.println("orderJson is: "+orderJson);
        pubSubTemplate.publish("order-topic", orderJson);
    }
}
