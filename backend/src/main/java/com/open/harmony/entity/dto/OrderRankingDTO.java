package com.open.harmony.entity.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@ToString
public class OrderRankingDTO {
    private String storeName;
    private int orderCount;

    public OrderRankingDTO(String storeName, int orderCount) {
        this.storeName = storeName;
        this.orderCount = orderCount;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}