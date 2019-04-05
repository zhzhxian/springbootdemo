package com.zzx.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orderId;

	private String buyerName;

	private String buyerPhone;

	private String buyerAddress;

	private String buyerOpenid;

	private BigDecimal orderAmount;

	private Byte orderStatus;

	private Byte payStatus;

	private Date createTime;

	private List<OrderDetail> orderDetails;

}