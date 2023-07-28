package com.open.harmony.mapper;

import com.open.harmony.entity.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;

@Mapper
public interface StoreMapper  {

    @Select("select * from store where store_id = #{storeId} and password = #{password}")
    Store Login(BigInteger storeId, String password);
}
