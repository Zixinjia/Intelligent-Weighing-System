package com.open.harmony.mapper;


import com.open.harmony.entity.Product;
import org.apache.ibatis.annotations.*;

import java.math.BigInteger;
import java.util.List;

@Mapper
//@Repository
public interface ProductMapper {
   @Select("select * from product")
    List<Product> findAll();

   @Insert("insert into product(product_name, product_price,product_unit, store_id,status,created_time,update_time) " +
           "values(#{productName},#{productPrice},#{productUnit},#{storeId},#{status},#{createdTime},#{updateTime})")
   Integer insertProduct(Product product);

   @Update("update product set product_price=#{productPrice},product_unit=#{productUnit},store_id=#{storeId}," +
           "status=#{status},update_time=#{updateTime} where product_name=#{productName} and store_id = #{storeId}")
   Integer updateProduct(Product product);


   @Delete("delete from product where product_name = #{productName} and store_id = #{storeId}")
   Integer deleteProduct(String productName, Integer storeId);


}
