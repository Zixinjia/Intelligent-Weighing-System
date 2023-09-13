package com.open.harmony.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.open.harmony.entity.OrderGoods;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/9/12 22:56
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDto {

    private Integer orderId;

    private Long storeId;

    private Double totalPrice;

    private String content;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    //关联字段
    private List<OrderGoods> orderGoodsList;

}
