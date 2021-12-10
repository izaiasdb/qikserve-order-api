package com.qikserve.order.dtos;

import java.util.List;

import com.qikserve.order.domain.OrderItem;

import lombok.Data;

@Data
public class OrderCalculatedDto {
    private long total;
    private long totalPromos;
    private long totalPayable;  
    private List<OrderItem> items;
}
