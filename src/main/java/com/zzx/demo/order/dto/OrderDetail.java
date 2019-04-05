package com.zzx.demo.order.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class OrderDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String detailId;

	private String orderId;

	private String productId;

	private String productName;

	private BigDecimal productPrice;

	private Integer productQuantity;

	private String productIcon;

	private Date createTime;

	private ProductInfo productInfo;

	private OrderMaster orderMaster;
}