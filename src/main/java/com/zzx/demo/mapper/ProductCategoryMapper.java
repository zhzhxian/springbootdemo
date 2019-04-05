package com.zzx.demo.mapper;

import org.springframework.stereotype.Repository;

import com.zzx.demo.dto.ProductCategory;

@Repository
public interface ProductCategoryMapper {
	int deleteByPrimaryKey(Integer categoryId);

	int insert(ProductCategory record);

	int insertSelective(ProductCategory record);

	ProductCategory selectByPrimaryKey(Integer categoryId);

	int updateByPrimaryKeySelective(ProductCategory record);

	int updateByPrimaryKey(ProductCategory record);
}