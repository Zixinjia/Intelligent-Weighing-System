package com.open.harmony.entity.dto;

import lombok.*;

import java.math.BigDecimal;

/**
 * 工单量
 */
@Getter
@Setter
@NoArgsConstructor
@ToString

public class OrderStatisticsDTO {
    private Integer orderCount;
    private BigDecimal totalAmount;
    private BigDecimal medianAmount;
    private BigDecimal averageAmount;



    public OrderStatisticsDTO(Integer orderCount, BigDecimal totalAmount, BigDecimal medianAmount, BigDecimal averageAmount) {
        this.orderCount = orderCount;
        this.totalAmount = totalAmount;
        this.medianAmount = medianAmount;
        this.averageAmount = averageAmount;
    }


}