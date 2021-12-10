package com.qikserve.order.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qikserve.order.domain.Product;
import com.qikserve.order.feignclients.ProductFeignClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductFeignClient productFeignClient;

	@GetMapping("{id}")
	public ResponseEntity<Product> findById(@PathVariable String id) {
		return ResponseEntity.ok(productFeignClient.findById(id).getBody());
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
			return new ResponseEntity<>(productFeignClient.findAll().getBody(), HttpStatus.OK);
	}
	
}
