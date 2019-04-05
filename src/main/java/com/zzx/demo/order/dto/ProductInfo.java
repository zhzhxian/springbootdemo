package com.zzx.demo.order.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class ProductInfo implements Serializable {
	private String productId;

	private String productName;

	private BigDecimal productPrice;

	private Integer productStock;

	private String productDescription;

	private String productIcon;

	private Integer productStatus;

	private Integer categoryType;

	private Date createTime;

}