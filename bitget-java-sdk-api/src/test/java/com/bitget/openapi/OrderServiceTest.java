package com.bitget.openapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.common.enums.MatchTypeEnum;
import com.bitget.openapi.common.enums.OrderTypeEnum;
import com.bitget.openapi.dto.request.*;
import com.bitget.openapi.dto.response.*;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class OrderServiceTest extends BaseTest {

    private static final String symbol = "cmt_btcusdt";

    @Test
    public void postOrder() throws IOException {
        OrderReq req = OrderReq.builder().client_oid("RFIut#1594137696335").symbol(symbol).match_price(MatchTypeEnum.LIMIT.getCode())
                .order_type(OrderTypeEnum.LIMIT.getCode().toString()).size("1").type("1").price("9209.5").build();
        JSONObject result = bitgetRestClient.contract().bitget().order().placeOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void batchOrders() throws IOException {

        PlaceBatchOrderReq req = PlaceBatchOrderReq.builder().symbol(symbol).orderDataList(null)
                .build();
        JSONObject result = bitgetRestClient.contract().bitget().order().batchOrders(req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void cancelOrder() throws IOException {
        CancelOrderParam param = CancelOrderParam.builder().symbol(symbol).orderId("664668908963233715").build();
        JSONObject result = bitgetRestClient.contract().bitget().order().cancelOrder(param);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void cancelBathOrders() throws IOException {
        CancelBatchOrdersReq req = CancelBatchOrdersReq.builder()
                .ids(Arrays.asList(new String[]{"662049979816214513", "662050232694996913"})).symbol(symbol).build();
        JSONObject result = bitgetRestClient.contract().bitget().order().cancelBathOrders(req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void getOrderDetail() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().order().getOrderDetail(symbol, "662052689865080815");
        System.out.println(JSON.toJSONString(result));
    }


    @Test
    public void getOrdersHistory() throws IOException{
        JSONObject result = bitgetRestClient.contract().bitget().order().getOrdersHistory(symbol, "1", "1",0);
        System.out.println(result);
    }

    @Test
    public void getOrdersCurrent() throws IOException{
        JSONObject result = bitgetRestClient.contract().bitget().order().getOrdersCurrent(symbol);
        System.out.println(result);
    }

    // pass
    @Test
    public void getFills() throws IOException {
        JSONObject result = bitgetRestClient.contract().bitget().order().getFills(symbol, "662062239896829913");
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void planOrder() throws IOException {
        PlanPlaceOrderReq req = PlanPlaceOrderReq.builder().client_oid("RFIut#1594137696335").symbol(symbol).execute_price("1000")
                .match_type(MatchTypeEnum.MARKET.getCode()).side("1").size("100").trigger_price("125").type("1")
                .build();
        JSONObject result = bitgetRestClient.contract().bitget().order().planOrder(req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void cancelPlan() throws IOException {
        CancelPlanParamReq planParamReq = CancelPlanParamReq.builder().symbol(symbol).orderId("649008575284248513")
                .build();
        JSONObject result = bitgetRestClient.contract().bitget().order().cancelPlan(planParamReq);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void currentPlan() throws IOException {
        PlanOrderReq req = PlanOrderReq.builder().page_index("1").page_size("50").side("2").end_time("1593584346687")
                .start_time("1593066788000").delegateType("2").build();
        JSONObject result = bitgetRestClient.contract().bitget().order().currentPlan(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }

    // pass
    @Test
    public void historyPlan() throws IOException {
        PlanOrderReq req = PlanOrderReq.builder().page_index("1").page_size("50").side("1").end_time("1593584346687")
                .start_time("1593066788000").delegateType("2").build();
        JSONObject result = bitgetRestClient.contract().bitget().order().historyPlan(symbol, req);
        System.out.println(JSON.toJSONString(result));
    }
}
