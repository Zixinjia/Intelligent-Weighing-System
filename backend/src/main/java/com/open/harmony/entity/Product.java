package com.open.harmony.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//-- auto-generated definition
//        create table goods
//        (
//        goods_id        int          not null
//        primary key,
//        goods_name      varchar(255) null,
//        goods_size      double       null,
//        store_id        int          null,
//        identify_method varchar(255) null,
//        status          int          null,
//        created_time    datetime     null,
//        update_time     datetime     null,
//        constraint goods_order
//        foreign key (order_id) references `order` (order_id),
//        constraint goods_store
//        foreign key (store_id) references store (store_id)
//        );
public class Product {
    private Integer productId;

    private String productName;

    private Double productSize;

    private Double productPrice;
    private String productUnit;

    private Integer storeId;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
