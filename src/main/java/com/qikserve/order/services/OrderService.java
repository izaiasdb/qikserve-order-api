package com.qikserve.order.services;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.qikserve.order.domain.Order;
import com.qikserve.order.repositories.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	public Order save (Order order) {
		if (order != null && order.getId() == null) {
			order.setId(UUID.randomUUID());
			order.setCreateAt(LocalDateTime.now());			
		}
		
		return orderRepository.save(order);	
	}
	
	
	public Order calculateOrder (Order order) {
		if (order.getItems() != null) {
			
		}
		
		
		return order; 
	}

}
