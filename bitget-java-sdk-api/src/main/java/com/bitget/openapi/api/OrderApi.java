package com.bitget.openapi.api;

import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface OrderApi {

    /**
     * 下单
     *
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/placeOrder")
    Call<JSONObject> placeOrder(@Body OrderReq body);

    /**
     * 批量下单
     *
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/batchOrders")
    Call<JSONObject> batchOrders(@Body PlaceBatchOrderReq body);

    /**
     * 取消订单
     *
     * @return
     */
    @POST("/api/swap/v3/order/cancel_order")
    Call<JSONObject> cancelOrder(@Body CancelOrderParam cancelOrderParam);

    /**
     * 批量撤单
     *
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/cancel_batch_orders")
    Call<JSONObject> cancelBathOrders(@Body CancelBatchOrdersReq body);

    /**
     * 获取单订单信息
     * @param symbol    合约code
     * @param orderId   订单ID
     * @return
     */
    @GET("/api/swap/v3/order/detail")
    Call<JSONObject> getOrderDetail(@Query("symbol") String symbol, @Query("orderId") String orderId);


    /**
     * 获取订单列表--历史委托 带分页的
     * @param symbol
     * @param pageIndex
     * @param pageSize
     * @param createDate
     * @return
     */
    @GET("/api/swap/v3/order/history")
    Call<JSONObject> getOrdersHistory(@Query("symbol") String symbol,
                                @Query("pageIndex") String pageIndex,
                                @Query("pageSize") String pageSize,
                                @Query("createDate") Integer createDate);


    /**
     * 获取订单列表--当前委托--不带分页的
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/order/current")
    Call<JSONObject> getOrdersCurrent(@Query("symbol") String symbol);


    /**
     * 查询成交明细
     * @param symbol    合约code
     * @param orderId   订单ID
     * @return
     */
    @GET("/api/swap/v3/order/fills")
    Call<JSONObject> getFills(@Query("symbol") String symbol, @Query("orderId") String orderId);

    /**
     * 计划委托下单
     * @param body
     * @return
     */
    @POST("/api/swap/v3/order/plan_order")
    Call<JSONObject> planOrder(@Body PlanPlaceOrderReq body);

    /**
     * 计划委托撤单
     * @return
     */
    @POST("/api/swap/v3/order/cancel_plan")
    Call<JSONObject> cancelPlan(@Body  CancelPlanParamReq cancelPlanParamReq);

    /**
     * 查询当前计划委托
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/order/currentPlan")
    Call<JSONObject> currentPlan(@Query("symbol") String symbol,
                                       @Query("side") String side,
                                       @Query("delegateType") String delegateType,
                                       @Query("pageIndex") String pageIndex,
                                       @Query("pageSize") String pageSize,
                                       @Query("startTime")String startTime,
                                       @Query("endTime") String endTime);

    /**
     * 查询计划历史委托
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/order/historyPlan")
    Call<JSONObject> historyPlan(@Query("symbol") String symbol,
                                       @Query("side") String side,
                                       @Query("delegateType") String delegateType,
                                       @Query("pageIndex") String pageIndex,
                                       @Query("pageSize") String pageSize,
                                       @Query("startTime")String startTime,
                                       @Query("endTime") String endTime);

}
