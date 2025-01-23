package com.ecommerceapi.mapper;

import com.ecommerceapi.dto.CartDTO;
import com.ecommerceapi.dto.CartItemDTO;
import com.ecommerceapi.model.Cart;
import com.ecommerceapi.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userID", source = "user.id")
    CartDTO toDTO(Cart cart);

    @Mapping(target = "user.id", source = "userID")
    Cart toEntity(CartDTO cartDTO);

    @Mapping(target = "productID", source = "product.id")
    CartItemDTO toDTO(CartItem cartItem);

    @Mapping(target = "product.id", source = "productID")
    CartItem toEntity(CartItemDTO cartItemDTO);
}
