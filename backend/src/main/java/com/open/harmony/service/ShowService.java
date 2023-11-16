package com.open.harmony.service;
import com.open.harmony.common.Result;
import org.springframework.stereotype.Service;


@Service
public interface ShowService {
    /**
     * 今日工单量统计
     * @return
     */
    Result getOrderStatistics();

    /**
     * 全年成交额变化情况
     * @param year
     * @return
     */
    Result getYearlyAmounts(int year);

    /**
     * 月度工单完成量统计
     */
    Result getMonthlyCompletedCounts(int year);

    /**
     * 销售量Top5
     * @return
     */
    Result getTopFiveOrderRankings();

    /**
     * 近6日人流量
     * @return
     */
    Result getFootfallForLastSixDays();

    /**
     * 分区销量
     * @return
     */
    Result getStoreTransactions();
}
