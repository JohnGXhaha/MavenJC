package com.test.aliPayTest;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeRefundResponse;

public class RefundTest {
	public static void main(String[] args) throws AlipayApiException {
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",
															"app_id","your private_key",
															"json",
															"GBK",
															"alipay_public_key",
															"RSA2");
		AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
		request.setBizContent("{" +
		"\"out_trade_no\":\"20150320010101001\"," +
		"\"trade_no\":\"2014112611001004680073956707\"," +
		"\"refund_amount\":200.12," +
		"\"refund_currency\":\"USD\"," +
		"\"refund_reason\":\"�����˿�\"," +
		"\"out_request_no\":\"HZ01RF001\"," +
		"\"operator_id\":\"OP001\"," +
		"\"store_id\":\"NJ_S_001\"," +
		"\"terminal_id\":\"NJ_T_001\"," +
		"      \"goods_detail\":[{" +
		"        \"goods_id\":\"apple-01\"," +
		"\"alipay_goods_id\":\"20010001\"," +
		"\"goods_name\":\"ipad\"," +
		"\"quantity\":1," +
		"\"price\":2000," +
		"\"goods_category\":\"34543238\"," +
		"\"body\":\"�ؼ��ֻ�\"," +
		"\"show_url\":\"http://www.alipay.com/xxx.jpg\"" +
		"        }]," +
		"      \"refund_royalty_parameters\":[{" +
		"        \"royalty_type\":\"transfer\"," +
		"\"trans_out\":\"2088101126765726\"," +
		"\"trans_out_type\":\"userId\"," +
		"\"trans_in_type\":\"userId\"," +
		"\"trans_in\":\"2088101126708402\"," +
		"\"amount\":0.1," +
		"\"amount_percentage\":100," +
		"\"desc\":\"���˸�2088101126708402\"" +
		"        }]" +
		"  }");
		AlipayTradeRefundResponse response = alipayClient.execute(request);
		if(response.isSuccess()){
		System.out.println("���óɹ�");
		} else {
		System.out.println("����ʧ��");
		}
		
	}
}
