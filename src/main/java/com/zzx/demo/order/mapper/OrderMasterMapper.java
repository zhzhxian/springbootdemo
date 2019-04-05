package com.zzx.demo.order.mapper;

import com.zzx.demo.order.dto.OrderMaster;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMasterMapper {
	int deleteByPrimaryKey(String orderId);

	int insert(OrderMaster record);

	int insertSelective(OrderMaster record);

	OrderMaster selectByPrimaryKey(String orderId);

	int updateByPrimaryKeySelective(OrderMaster record);

	int updateByPrimaryKey(OrderMaster record);

	OrderMaster queryOrderWithDetail(String orderId);

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月30日
	 * @return
	 */
	List<OrderMaster> queryOrderWithDetailList();

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月30日
	 * @return
	 */
	List<OrderMaster> queryOrderWithDetailProductList();

}