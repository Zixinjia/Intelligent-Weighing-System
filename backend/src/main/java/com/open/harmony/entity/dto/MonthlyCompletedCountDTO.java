package com.open.harmony.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MonthlyCompletedCountDTO {
    private String month;
    private int completedCount;
}