/**
 * 
 */
package com.zzx.demo.service;

import java.util.List;

import com.zzx.demo.dto.OrderDetail;
import com.zzx.demo.dto.OrderMaster;

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
