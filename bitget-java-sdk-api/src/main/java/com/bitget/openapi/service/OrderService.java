package com.bitget.openapi.service;

import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;

import java.io.IOException;
import java.util.List;

/**
 * 订单服务
 *
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface OrderService {
    /**
     * 下单
     *
     * @param orderRequest
     * @return
     * @throws IOException
     */
    JSONObject placeOrder(OrderReq orderRequest) throws IOException;

    /**
     * 批量下单
     *
     * @param placeBatchOrderReq
     * @return
     * @throws IOException
     */
    JSONObject batchOrders(PlaceBatchOrderReq placeBatchOrderReq) throws IOException;

    /**
     * 取消订单
     *
     * @return
     * @throws IOException
     */
    JSONObject cancelOrder(CancelOrderParam cancelOrderParam) throws IOException;

    /**
     * 批量撤单
     *
     * @param param
     * @return
     * @throws IOException
     */
    JSONObject cancelBathOrders(CancelBatchOrdersReq param) throws IOException;

    /**
     * 获取单订单信息
     *
     * @param symbol
     * @param orderId
     * @return
     * @throws IOException
     */
    JSONObject getOrderDetail(String symbol, String orderId) throws IOException;


    /** 获取订单列表--历史委托-带分页的
     * @param symbol
     * @param pageIndex
     * @param pageSize
     * @return
      */
    JSONObject getOrdersHistory(String symbol,String pageIndex,
                                 String pageSize,Integer createDate) throws IOException;

    /**获取订单列表---当前委托不带分页的
     * @param symbol
     * @return
    */
    JSONObject getOrdersCurrent(String symbol) throws IOException;

    /**
     * 查询成交明细
     *
     * @param symbol
     * @param orderId
     * @return
     * @throws IOException
     */
    JSONObject getFills(String symbol, String orderId) throws IOException;

    /**
     * 计划委托下单
     *
     * @param planPlaceOrderReq
     * @return
     * @throws IOException
     */
    JSONObject planOrder(PlanPlaceOrderReq planPlaceOrderReq) throws IOException;

    /**
     * 计划委托撤单
     *
     * @return
     * @throws IOException
     */
    JSONObject cancelPlan(CancelPlanParamReq  cancelPlanParamReq) throws IOException;

    /**
     * 查询当前计划委托
     *
     * @param symbol
     * @param planOrderReq
     * @return
     * @throws IOException
     */
    JSONObject currentPlan(String symbol, PlanOrderReq planOrderReq) throws IOException;

    /**
     * 查询计划历史委托
     *
     * @param symbol
     * @param planOrderReq
     * @return
     * @throws IOException
     */
    JSONObject historyPlan(String symbol, PlanOrderReq planOrderReq) throws IOException;
}
