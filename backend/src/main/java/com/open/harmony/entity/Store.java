package com.open.harmony.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigInteger;
import java.util.Date;

//-- auto-generated definition
//        create table store
//        (
//        store_id     bigint       not null
//        primary key,
//        store_name   varchar(255) null,
//        password     varchar(255) null,
//        store_type   varchar(255) null comment '所在分区：如冷冻区、水产区',
//        status       int          null comment '关门，营业中',
//        created_time datetime     null,
//        update_time  datetime     null
//        );
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Store {
    private BigInteger storeId;

    private String storeName;

    private String password;

    private String storeType;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private Integer transactionCount;
}
