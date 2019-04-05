package com.zzx.demo.order.mapper;

import org.springframework.stereotype.Repository;

import com.zzx.demo.order.dto.ProductCategory;

@Repository
public interface ProductCategoryMapper {
	int deleteByPrimaryKey(Integer categoryId);

	int insert(ProductCategory record);

	int insertSelective(ProductCategory record);

	ProductCategory selectByPrimaryKey(Integer categoryId);

	int updateByPrimaryKeySelective(ProductCategory record);

	int updateByPrimaryKey(ProductCategory record);
}