package com.bitget.openapi.service;


import com.alibaba.fastjson.JSONObject;
import com.bitget.openapi.dto.request.ChangeHoldModel;
import com.bitget.openapi.dto.response.AllPosition;
import com.bitget.openapi.dto.response.FVirtualCaptialOperator;
import com.bitget.openapi.dto.response.HoldModelDto;
import com.bitget.openapi.dto.response.Holds;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;

/**
 * 持仓服务
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public interface PositionService {
    /**
     *获取全部合约仓位信息
     * @return
     * @throws IOException
     */
    JSONObject getAllPosition() throws IOException;

    /**
     * 获取全部合约仓位信息
     * @param symbol
     * @return
     * @throws IOException
     */
    JSONObject getSinglePosition(String symbol) throws IOException;

    /**
     * 出入金数据记录
     * @return
     * @throws IOException
     */
    JSONObject  virtualCapital(String  symbol,
                                                  String ftype,
                                                  Integer limit,
                                                  Integer gt,
                                                  Integer lt)throws  IOException;

    /**
     * 修改用户的平仓模式(全仓，逐仓）
     * @param holdModel
     * @return
     */
    JSONObject changeHoldMode(ChangeHoldModel holdModel)throws  IOException;
}
