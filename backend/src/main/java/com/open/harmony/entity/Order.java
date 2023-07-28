package com.open.harmony.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/28 11:42
 */
//create table `order`
//        (
//        order_id     int auto_increment
//        primary key,
//        store_id     bigint        null,
//        total_price  double(16, 2) null comment '订单总价',
//        content      varchar(255)  null,
//        status       int           null,
//        created_time datetime      null,
//        update_time  datetime      null
//        );
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    private Integer orderId;

    private BigInteger storeId;

    private Double totalPrice;

    private String content;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
