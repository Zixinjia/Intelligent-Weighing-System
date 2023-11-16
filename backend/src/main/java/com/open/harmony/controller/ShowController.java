package com.open.harmony.controller;
import com.open.harmony.common.Result;
import com.open.harmony.service.ShowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * 大屏展示接口
 */
@Api(tags = "大屏显示模块")
@RestController
@RequestMapping("/show")
public class ShowController {
    @Autowired
    private  ShowService showService;


    public ShowController(ShowService showService){
        this.showService = showService;
    }

    /**
     * 今日工单量统计
     * @return
     */
    @ApiOperation("今日工单量统计")
    @GetMapping("/statistics")
    public Result getOrderStatistics() {
        return showService.getOrderStatistics();
    }

    /**
     * 全年成交额变化情况
     * @param year
     * @return
     */
    @ApiOperation("全年成交额变化情况")
    @GetMapping("/yearly-amounts")
    public Result getYearlyAmounts(@RequestParam("year") int year) {
        return showService.getYearlyAmounts(year);
    }

    /**
     * 月度工单完成量统计
     */
    @ApiOperation("月度工单完成量统计")
    @GetMapping("/monthly-completed-counts")
    public Result getMonthlyCompletedCounts(@RequestParam("year") int year) {
        return showService.getMonthlyCompletedCounts(year);
    }

    /**
     * 销售量Top5
     * @return
     */
    @ApiOperation("销售量Top5")
    @GetMapping("/top-five-rankings")
    public Result getTopFiveOrderRankings() {
        return showService.getTopFiveOrderRankings();
    }

    /**
     * 近6日人流量
     * @return
     */
    @ApiOperation("近6日人流量")
    @GetMapping("/stream-for-last-six-days")
    public Result getFootfallForLastSixDays() {
        return showService.getFootfallForLastSixDays();
    }

    /**
     * 分区销量
     * @return
     */
    @ApiOperation("分区销量")
    @GetMapping("/transactions-by-store")
    public Result getStoreTransactions() {
        return showService.getStoreTransactions();
    }
}