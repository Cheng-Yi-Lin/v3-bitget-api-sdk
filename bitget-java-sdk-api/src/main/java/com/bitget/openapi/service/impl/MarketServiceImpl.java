package com.bitget.openapi.service.impl;


import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.api.MarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.dto.response.*;
import com.bitget.openapi.service.MarketService;

import java.io.IOException;
import java.util.List;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class MarketServiceImpl implements MarketService {

    private final MarketApi marketApi;

    public MarketServiceImpl(ApiClient client) {
        marketApi = client.create(MarketApi.class);
    }

    @Override
    public JSONObject getTime() throws IOException {
        return marketApi.getTime().execute().body();
    }

    @Override
    public JSONObject getContractsApi() throws IOException {
        return marketApi.getContractsApi().execute().body();
    }

    @Override
    public JSONObject getTickersApi() throws IOException {
        return marketApi.getTickersApi().execute().body();
    }

    @Override
    public JSONObject getTicker(String symbol) throws IOException {
        return marketApi.getTicker(symbol).execute().body();
    }

    @Override
    public JSONObject getTrades(String symbol, String limit) throws IOException {
        return marketApi.getTrades(symbol, limit).execute().body();
    }

    @Override
    public JSONObject getDepthApi(String symbol, String limit) throws IOException {
        return marketApi.getDepthApi(symbol, limit).execute().body();
    }

    @Override
    public JSONObject getCandles(String symbol, String start, String end,Long startTime,Long endTime, String granularity) throws IOException {
        return marketApi.getCandles(symbol, start, end,startTime,endTime,granularity).execute().body();
    }

    @Override
    public JSONObject getIndex(String symbol) throws IOException {
        return marketApi.getIndex(symbol).execute().body();
    }

    @Override
    public JSONObject getOpenInterestApi(String symbol) throws IOException {
        return marketApi.getOpenInterestApi(symbol).execute().body();
    }

    @Override
    public JSONObject getPriceLimitApi(String symbol) throws IOException {
        return marketApi.getPriceLimitApi(symbol).execute().body();
    }

    @Override
    public JSONObject getFundingTimeApi(String symbol) throws IOException {
        return marketApi.getFundingTimeApi(symbol).execute().body();
    }
    @Override
    public JSONObject getNewHistoricalFundingRateApi(String symbol, String pageIndex, String pageSize) throws IOException {

        return marketApi.getNewHistoricalFundingRateApi(symbol,pageIndex,pageSize).execute().body();
    }

    @Override
    public JSONObject getMarkPriceApi(String symbol) throws IOException {
        return marketApi.getMarkPriceApi(symbol).execute().body();
    }


    @Override
    public JSONObject calOpenCount(String symbol, String amount, String leverage, String openPrice) throws IOException {
        return marketApi.calOpenCount(symbol, amount, leverage, openPrice).execute().body();
    }

}
