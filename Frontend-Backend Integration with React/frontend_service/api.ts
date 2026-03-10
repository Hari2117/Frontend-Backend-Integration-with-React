package com.ecommerce.service;

import com.ecommerce.model.entity.Order;
import com.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

}