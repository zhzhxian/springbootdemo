package com.zzx.demo.order.mapper;

import org.springframework.stereotype.Repository;

import com.zzx.demo.order.dto.ProductInfo;

@Repository
public interface ProductInfoMapper {
	int deleteByPrimaryKey(String productId);

	int insert(ProductInfo record);

	int insertSelective(ProductInfo record);

	ProductInfo selectByPrimaryKey(String productId);

	int updateByPrimaryKeySelective(ProductInfo record);

	int updateByPrimaryKey(ProductInfo record);
}