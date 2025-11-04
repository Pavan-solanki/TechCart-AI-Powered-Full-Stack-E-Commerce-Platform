package com.techCart.SpringEcom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
