package com.open.harmony.mapper;

import com.open.harmony.entity.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface GoodsMapper {
   @Select("select * from goods")
    List<Goods> findAll();

   @Insert("insert into goods(goods_name, goods_size, store_id, identify_method, status) " +
           "values(#{goodsName},#{goodsSize},#{storeId},#{identifyMethod},#{status})")
   Integer insertGoods(Goods goods);

   @Update("update goods set goods_name=#{goodsName},goods_size=#{goodsSize},store_id=#{storeId},identify_method=#{identifyMethod}," +
           "status=#{status} where goods_id=#{goodsId}")
   Integer updateGoods(Goods goods);
//    int insert01(Goods goods);
//
//    int delete(Integer id);
//
//    List<Goods> findByName(String value);

}
