/**
 * 
 */
package com.zzx.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zzx.demo.dto.OrderDetail;
import com.zzx.demo.dto.OrderMaster;
import com.zzx.demo.service.OrderMasterService;

/**
 * OrderController
 * 
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderMasterService orderMasterService;

	@RequestMapping(value = "/list", method = { RequestMethod.GET })
	public List<OrderMaster> list() {
		return orderMasterService.queryOrderWithDetailProductList();
	}

	/**
	 * 延迟加载测试
	 * 
	 * @author zhengzhongxian
	 * @date 2019年3月30日
	 * @param orderId
	 * @return
	 */
	@RequestMapping(value = "/getOrderById", method = { RequestMethod.GET })
	public OrderMaster getOrderById(String orderId) {
		OrderMaster orderMaster = orderMasterService.queryOrderWithDetail(orderId);
		return orderMaster;
	}

	/**
	 * 延迟加载
	 * 
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 * @param detailId
	 * @return
	 */
	@RequestMapping(value = "/orderDetailLazyLoadingOrder", method = { RequestMethod.GET })
	public List<OrderDetail> orderDetailLazyLoadingOrder() {
		List<OrderDetail> orderDetails = orderMasterService.orderDetailLazyLoadingOrder();
		return orderDetails;
	}
}
