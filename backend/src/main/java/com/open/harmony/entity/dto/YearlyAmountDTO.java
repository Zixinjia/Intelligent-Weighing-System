package com.open.harmony.entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 全年交易额对应实体类
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class YearlyAmountDTO {
    private String month;
    private BigDecimal amount;
}