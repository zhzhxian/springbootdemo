/**
 * 
 */
package com.zzx.demo.order.service;

import com.zzx.demo.order.dto.OrderDetail;
import com.zzx.demo.order.dto.OrderMaster;

import java.util.List;

/**
 * OrderMasterService
 * 
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description
 */
public interface OrderMasterService {
	OrderMaster selectByPrimaryKey(String orderId);

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

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 * @return
	 */
	List<OrderDetail> orderDetailLazyLoadingOrder();

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 * @param string
	 * @return
	 */
	OrderMaster testLevelOneCatch(String orderId);

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 * @param string
	 * @return
	 */
	OrderMaster testLevelTwoCatch1(String orderId);

	/**
	 * @author zhengzhongxian
	 * @date 2019年3月31日
	 * @param string
	 * @return
	 */
	OrderMaster testLevelTwoCatch2(String orderId);

}
