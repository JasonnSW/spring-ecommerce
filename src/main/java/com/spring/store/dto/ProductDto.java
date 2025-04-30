package com.spring.store.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter

public class ProductDto {
    private long id;
    private String name;
    private BigDecimal price;
    private String description;
    private Byte categoryId;
}
