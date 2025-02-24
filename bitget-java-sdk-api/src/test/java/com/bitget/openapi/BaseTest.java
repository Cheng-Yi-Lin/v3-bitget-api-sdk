package com.bitget.openapi;

import org.junit.After;
import org.junit.Before;

import com.bitget.openapi.common.client.BitgetRestClient;
import com.bitget.openapi.common.domain.ClientParameter;
import com.bitget.openapi.common.enums.SupportedLocaleEnum;

/**
 * @author bitget-sdk-team
 * @date 2019-01-15
 */
public class BaseTest {
	
	/**
	 * 用户 apiKey 替换成自己的
	 */
	private final String apiKey = "";
	/**
	 * 用户 secretKey 替换成自己的
	 */
	private final String secretKey = "";
	/**
	 * 口令 替换成自己的
	 */
	private final String passphrase = "";
	/**
	 * bitget open api 根路径
	 */
	//
    private final String baseUrl = "https://capi.bitget.com";

	private final ClientParameter parameter = ClientParameter.builder().apiKey(apiKey).secretKey(secretKey).passphrase(passphrase).baseUrl(baseUrl)
			.locale(SupportedLocaleEnum.ZH_CN.getName()).build();
	public BitgetRestClient bitgetRestClient;
	
	@Before
	public void setup() {
		bitgetRestClient = BitgetRestClient.builder().configuration(parameter).build();
	}
	
	@After
	public void tearDown() {
		
	}
}
