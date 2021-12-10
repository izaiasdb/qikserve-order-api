package com.qikserve.order.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qikserve.order.domain.Order;
import com.qikserve.order.services.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
	
	private final OrderService orderService; 
	
	@PostMapping
	public ResponseEntity<Order> save(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.save(order), HttpStatus.CREATED);
	}
	
	@GetMapping("/calculateOrder")
	public ResponseEntity<Order> calculateOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.save(order), HttpStatus.CREATED);
	}
	
}
