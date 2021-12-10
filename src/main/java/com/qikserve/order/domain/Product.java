package com.qikserve.order.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private Long price;
    private List<Promotion> promotions;
}
