package com.open.harmony.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

/**
 * @author honor
 * @version 1.0
 * Create by 2023/7/28 11:42
 */
//
//create table order_goods
//        (
//        goods_id          int auto_increment
//        primary key,
//        goods_name        varchar(255)  null,
//        goods_total_unit  varchar(255)  null,
//        goods_price       double(16, 2) null,
//        goods_total_price double(16, 2) null,
//        order_id          int           null,
//        store_id          bigint        null,
//        status            int           null,
//        created_time      datetime      null,
//        update_time       datetime      null
//        );
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderGoods {
    @TableId(type = IdType.AUTO)
    private Integer goodsId;

    private String goodsName;

    private String goodsWeight;

    private Double goodsPrice;

    private Double goodsTotalPrice;

    private Integer orderId;

    private Integer storeId;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;


}
