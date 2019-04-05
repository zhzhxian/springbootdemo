package com.zzx.demo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zzx.demo.dto.OrderDetail;

@Repository
public interface OrderDetailMapper {
	int deleteByPrimaryKey(String detailId);

	int insert(OrderDetail record);

	int insertSelective(OrderDetail record);

	OrderDetail selectByPrimaryKey(String detailId);

	int updateByPrimaryKeySelective(OrderDetail record);

	int updateByPrimaryKey(OrderDetail record);

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 * @param detailId
	 * @return
	 */
	List<OrderDetail> orderDetailLazyLoadingOrder();
}