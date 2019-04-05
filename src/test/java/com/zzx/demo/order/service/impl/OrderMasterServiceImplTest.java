/**
 * 
 */
package com.zzx.demo.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.zzx.demo.order.dto.OrderDetail;
import com.zzx.demo.order.dto.OrderMaster;
import com.zzx.demo.order.service.OrderMasterService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * OrderMasterServiceImplTest
 * 
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterServiceImplTest {

	@Autowired
	private OrderMasterService orderMasterService;

	/**
	 * Test method for
	 * {@link com.zzx.demo.order.service.impl.OrderMasterServiceImpl#selectByPrimaryKey(java.lang.String)}.
	 */
	@Test
	public void testSelectByPrimaryKey() {
		OrderMaster orderMaster = orderMasterService.selectByPrimaryKey("1528608013765692486");
		log.info("testSelectByPrimaryKey返回结果：{}", JSON.toJSON(orderMaster).toString());
	}

	@Test
	public void testQueryOrderWithDetail() {
		OrderMaster orderMaster = orderMasterService.queryOrderWithDetail("1528608013765692486");
		log.info("testQueryOrderWithDetail返回结果：{}", JSON.toJSON(orderMaster).toString());
	}

	@Test
	public void testQueryOrderWithDetailList() {
		List<OrderMaster> orderMasterList = orderMasterService.queryOrderWithDetailList();
		log.info("testQueryOrderWithDetailList返回结果：{}", JSON.toJSON(orderMasterList).toString());
	}

	@Test
	public void testQueryOrderWithDetailProductList() {
		List<OrderMaster> orderMasterList = orderMasterService.queryOrderWithDetailProductList();
		log.info("testQueryOrderWithDetailProductList返回结果：{}", JSON.toJSON(orderMasterList).toString());
	}

	@Test
	public void testOrderDetailLazyLoadingOrder() {
		log.info("延迟加载测试开始");
		List<OrderDetail> orderDetails = orderMasterService.orderDetailLazyLoadingOrder();
		log.info("分割线11111");
		int count = 0;
		for (OrderDetail orderDetail : orderDetails) {
			count++;
			log.info("第{}次加载开始-------", count);
			OrderMaster orderMaster = orderDetail.getOrderMaster();
			log.info("第{}次加载结束-------", count);
		}
		log.info("分割线22222");
		// log.info("testOrderDetailLazyLoadingOrder返回结果：{}",
		// JSON.toJSON(orderDetails).toString());
		log.info("延迟加载测试结束");
	}

	/**
	 * 一级缓存测试 mybatis默认开启一级缓存
	 * 
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 */
	@Test
	public void testLevelOneCatch() {
		OrderMaster orderMaster = orderMasterService.testLevelOneCatch("1232456");

	}

	/**
	 * 
	 * 二级级缓存测试 mybatis
	 * 
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 */
	@Test
	public void testLevelTwoCatch() {
		OrderMaster orderMaster1 = orderMasterService.testLevelTwoCatch1("1232456");

		OrderMaster orderMaster2 = orderMasterService.testLevelTwoCatch2("1232456");
	}
}
