package com.open.harmony.mapper;

import com.open.harmony.entity.Store;
import com.open.harmony.entity.Stream;
import com.open.harmony.entity.dto.MonthlyCompletedCountDTO;
import com.open.harmony.entity.dto.OrderCountDTO;
import com.open.harmony.entity.dto.YearlyAmountDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author showMapper
 * @version 1.0
 * Create by 2023/11/15 17:52
 */

@Mapper
public interface ShowMapper {
    /**
     * 今日总订单量
     * @param today
     * @return
     */
    @Select("SELECT COUNT(total_price) FROM `order` WHERE DATE(created_time) = #{today}")
    Integer getOrderCount(@Param("today") LocalDate today);

    /**
     * 今日销售额
     * @param today
     * @return
     */
    @Select("SELECT SUM(total_price) FROM `order` WHERE DATE(created_time) = #{today}")
    BigDecimal getTotalAmount(@Param("today") LocalDate today);

    /**
     * 平均数
     * @param today
     * @return
     */
    @Select("SELECT AVG(total_price) FROM `order` WHERE DATE(created_time) = #{today}")
    BigDecimal getAverageAmount(@Param("today") LocalDate today);

    /**
     * 中位数
     * @param today
     * @return
     */
    @Select("SELECT AVG(total_price) FROM (SELECT total_price, @rownum:=@rownum+1 AS rownum, @total_rows:=@rownum FROM" +
            " (SELECT total_price FROM `order` WHERE DATE(created_time) = #{today} ORDER BY total_price) t," +
            " (SELECT @rownum:=0, @total_rows:=0) r) sub WHERE rownum IN (FLOOR((@total_rows+1)/2), FLOOR((@total_rows+2)/2))")
    BigDecimal getMedianAmount(@Param("today") LocalDate today);

    /**
     * 全年成交金额变化情况
     * @param year
     * @return
     */
    @Select("SELECT DATE_FORMAT(created_time, '%Y-%m') AS month, SUM(total_price) AS amount FROM `order` WHERE YEAR(created_time) = #{year} GROUP BY month")
    List<YearlyAmountDTO> getYearlyAmounts(@Param("year") int year);

    /**
     * 月度工单完成量统计
     * @param year
     * @return
     */
    @Select("SELECT MONTH(created_time) AS month, COUNT(*) AS completedCount FROM `order` WHERE  YEAR(created_time) = #{year} GROUP BY month")
    List<MonthlyCompletedCountDTO> getMonthlyCompletedCounts(@Param("year") int year);

    /**
     * 成交排行Top5
     */
    @Select("SELECT store_id, COUNT(*) AS orderCount FROM `order` GROUP BY store_id ORDER BY orderCount DESC LIMIT 5")
    List<OrderCountDTO> getTopFiveOrderCountsByStore();


    @Select("SELECT store_name FROM store WHERE store_id = #{storeId}")
    String getStoreNameById(@Param("storeId") int storeId);

    /**
     * 近6日人流量
     * @return
     */
    @Select("SELECT id, timestamp, footfall_count, market_id, location " +
            "FROM `stream` " +
            "WHERE DATE(timestamp) >= CURDATE() - INTERVAL 5 DAY " +
            "ORDER BY timestamp ")
    List<Stream> getFootfallForLastSixDays();


//    @Select("SELECT s.store_id, s.store_name, s.password, s.store_type, s.status, COUNT(*) AS transactionCount " +
//            "FROM `order` o " +
//            "JOIN store s ON o.store_id = s.store_id " +
//            "GROUP BY s.store_id")
@Select("SELECT s.store_id, s.store_name, s.password, s.store_type, s.status, COUNT(o.order_id) AS transactionCount " +
        "FROM `store` s " +
        "LEFT JOIN `order` o ON s.store_id = o.store_id " +
        "GROUP BY s.store_id")

    List<Store> getStoreTransactions();
}
