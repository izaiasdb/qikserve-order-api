package com.qikserve.order.domain;

import lombok.Data;

@Data
public class OrderItem {
    private Product product;
    private Integer quantity;
    private long total;
    private long totalPromos;
    private long totalPayable;
}
