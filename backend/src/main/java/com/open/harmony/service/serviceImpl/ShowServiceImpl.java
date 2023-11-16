package com.open.harmony.service.serviceImpl;

import com.open.harmony.common.Result;
import com.open.harmony.entity.Stream;
import com.open.harmony.entity.dto.OrderCountDTO;
import com.open.harmony.entity.dto.OrderRankingDTO;
import com.open.harmony.entity.dto.OrderStatisticsDTO;
import com.open.harmony.mapper.ShowMapper;
import com.open.harmony.service.ShowService;
import com.open.harmony.util.FakeDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jzx
 * @version 1.0
 * Create by 2023/11/15 18:17
 */
@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private final ShowMapper showMapper;

    public ShowServiceImpl(ShowMapper showMapper) {
        this.showMapper = showMapper;
    }

    /**
     * 今日工单量统计
     *
     * @return
     */
    @Override
    public Result getOrderStatistics() {
        LocalDate today = LocalDate.now();
        Integer orderCount = showMapper.getOrderCount(today);
        BigDecimal totalAmount = showMapper.getTotalAmount(today);
        BigDecimal medianAmount = showMapper.getMedianAmount(today);
        BigDecimal averageAmount = showMapper.getAverageAmount(today);

        OrderStatisticsDTO statistics = new OrderStatisticsDTO(orderCount, totalAmount, medianAmount, averageAmount);
        return Result.success(statistics);
    }

    /**
     * 全年成交金额变化情况
     *
     * @param year
     * @return
     */
    @Override
    public Result getYearlyAmounts(int year) {
        return Result.success(showMapper.getYearlyAmounts(year));
    }

    /**
     * 月度销售额
     *
     * @param year
     * @return
     */
    @Override
    public Result getMonthlyCompletedCounts(int year) {
        return Result.success(showMapper.getMonthlyCompletedCounts(year));
    }

    /**
     * 成交排行TOP5
     *
     * @return
     */
    @Override
    public Result getTopFiveOrderRankings() {
        List<OrderCountDTO> orderCounts = showMapper.getTopFiveOrderCountsByStore();
        List<OrderRankingDTO> orderRankings = new ArrayList<>();

        for (OrderCountDTO orderCount : orderCounts) {
            int storeId = orderCount.getStoreId();
            String storeName = showMapper.getStoreNameById(storeId);
            int orderCountValue = orderCount.getOrderCount();

            OrderRankingDTO orderRanking = new OrderRankingDTO(storeName, orderCountValue);
            orderRankings.add(orderRanking);
        }
        return Result.success(orderRankings);
    }

    /**
     * 近6日人流量
     *
     * @return
     */
    @Override
    public Result getFootfallForLastSixDays() {
        List<Stream> fakeDataList = FakeDataGenerator.generateFakeStreamData();
        List<Stream> result = new ArrayList<>();

        LocalDateTime currentDate = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS);
        LocalDateTime startDate = currentDate.minusDays(5);

        for (Stream streamData : fakeDataList) {
            LocalDateTime timestamp = streamData.getTimestamp();
            if (timestamp.isAfter(startDate) && timestamp.isBefore(currentDate.plusDays(1))) {
                result.add(streamData);
            }
        }

        return Result.success(result);
    }

    /**
     * 分区情况
     *
     * @return
     */
    @Override
    public Result getStoreTransactions() {
        return Result.success(showMapper.getStoreTransactions());
    }
}
