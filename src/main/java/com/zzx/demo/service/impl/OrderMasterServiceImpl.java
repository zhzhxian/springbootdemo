/**
 * 
 */
package com.zzx.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.zzx.demo.dto.OrderDetail;
import com.zzx.demo.dto.OrderMaster;
import com.zzx.demo.mapper.OrderDetailMapper;
import com.zzx.demo.mapper.OrderMasterMapper;
import com.zzx.demo.service.OrderMasterService;

import lombok.extern.slf4j.Slf4j;

/**
 * OrderMasterServiceImpl
 * 
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description
 */
@Service
@Slf4j
public class OrderMasterServiceImpl implements OrderMasterService {

	@Autowired
	private OrderMasterMapper orderMasterMapper;
	@Autowired
	private OrderDetailMapper orderDetailMapper;

	@Override
	public OrderMaster selectByPrimaryKey(String orderId) {
		log.info("开始查询订单信息：{}", orderId);
		return orderMasterMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public OrderMaster queryOrderWithDetail(String orderId) {
		return orderMasterMapper.queryOrderWithDetail(orderId);
	}

	@Override
	public List<OrderMaster> queryOrderWithDetailList() {
		return orderMasterMapper.queryOrderWithDetailList();
	}

	@Override
	public List<OrderMaster> queryOrderWithDetailProductList() {
		return orderMasterMapper.queryOrderWithDetailProductList();
	}

	@Override
	public List<OrderDetail> orderDetailLazyLoadingOrder() {
		return orderDetailMapper.orderDetailLazyLoadingOrder();
	}

	/**
	 * 一级缓存测试
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public OrderMaster testLevelOneCatch(String orderId) {
		// 第一次查询
		log.info("第一次查询");
		OrderMaster orderMaster1 = orderMasterMapper.selectByPrimaryKey(orderId);
		log.info("第一次查询结果：{}", JSON.toJSON(orderMaster1));

		// 执行更新之后清除一级缓存
//		orderMaster1.setBuyerName("张三11111");
//		orderMasterMapper.updateByPrimaryKey(orderMaster1);

		log.info("第二次查询");
		OrderMaster orderMaster2 = orderMasterMapper.selectByPrimaryKey(orderId);
		log.info("第二次查询结果：{}", JSON.toJSON(orderMaster2));
		return null;
	}

	/**
	 * 二级缓存测试
	 */
	@Override
	public OrderMaster testLevelTwoCatch1(String orderId) {
		log.info("二级缓存测试1111");
		// 第一次查询
		log.info("第一次查询");
		OrderMaster orderMaster1 = orderMasterMapper.selectByPrimaryKey(orderId);
		log.info("第一次查询结果：{}", JSON.toJSON(orderMaster1));
		// 执行更新之后清除二级级缓存
		orderMaster1.setBuyerName("张三6666");
		orderMasterMapper.updateByPrimaryKey(orderMaster1);
		return orderMaster1;
	}

	/**
	 * 二级缓存测试
	 */
	@Override
	public OrderMaster testLevelTwoCatch2(String orderId) {
		log.info("二级缓存测试2222");
		log.info("第二次查询");
		OrderMaster orderMaster2 = orderMasterMapper.selectByPrimaryKey(orderId);
		log.info("第二次查询结果：{}", JSON.toJSON(orderMaster2));
		return orderMaster2;
	}

}
