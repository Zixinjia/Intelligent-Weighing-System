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

   @Insert("insert into product(product_name, product_price,product_unit, store_id,status) " +
           "values(#{productName},#{productPrice},#{productUnit},#{storeId},#{status})")
   Integer insertProduct(Product product);

   @Update("update product set product_name=#{productName},product_price=#{productPrice},product_unit=#{productUnit},store_id=#{storeId}," +
           "status=#{status} where product_name=#{productName}")
   Integer updateProduct(Product product);


   @Delete("delete from product where product_name = #{productName} and store_id = #{storeId}")
   Integer deleteProduct(String productName, Integer storeId);


}
