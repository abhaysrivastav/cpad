package com.educative.ecommerce.dto.cart;

import com.educative.ecommerce.model.Cart;
import com.educative.ecommerce.model.User;

import java.util.ArrayList;
import java.util.List;

public class CartDto {

    //list of each item
    private List<CartItemDto> cartItems;

    // total cost for the cart
    private double totalCost;

    public CartDto(List<CartItemDto> cartItemDtoList, double totalCost) {
        this.cartItems = cartItemDtoList;
        this.totalCost = totalCost;
    }

    public List<CartItemDto> getcartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDto> cartItemDtoList) {
        this.cartItems = cartItemDtoList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
