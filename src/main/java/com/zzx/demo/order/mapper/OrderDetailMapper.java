package com.zzx.demo.order.mapper;

import com.zzx.demo.order.dto.OrderDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

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
	 * @return
	 */
	List<OrderDetail> orderDetailLazyLoadingOrder();
}