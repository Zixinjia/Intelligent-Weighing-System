package com.open.harmony.entity.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderCountDTO {
    private int storeId;
    private int orderCount;

    public OrderCountDTO(int storeId, int orderCount) {
        this.storeId = storeId;
        this.orderCount = orderCount;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
}