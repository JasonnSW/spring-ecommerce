package com.spring.store.mappers;

import com.spring.store.dto.ProductDto;
import com.spring.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target="categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
