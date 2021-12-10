package com.qikserve.order.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document(value = "promotion")
public class Promotion {
    
	@Id
    private String id;
    private PromotionTypeEnum type;
    private Integer required_qty;
    private Integer free_qty;
}
