package com.qikserve.order.repositories;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qikserve.order.domain.Order;

public interface OrderRepository extends MongoRepository<Order, UUID> {

}
