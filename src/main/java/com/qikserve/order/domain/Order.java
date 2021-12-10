package com.qikserve.order.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "order")
public class Order {

    @Id
    private long total;
    private long totalPromos;
    private long totalPayable;private UUID id;    
    private LocalDateTime createAt;
    private List<OrderItem> items;
}
