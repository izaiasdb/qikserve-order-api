package com.qikserve.order.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.qikserve.order.domain.Product;

@Component
@FeignClient(name = "products", url = "localhost:8081", path = "/products")
public interface ProductFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Product> findById(@PathVariable String id);
	
	@GetMapping
	ResponseEntity<List<Product>> findAll();	
}