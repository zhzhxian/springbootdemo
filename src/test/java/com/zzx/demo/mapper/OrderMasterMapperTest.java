/**
 * 
 */
package com.zzx.demo.mapper;

import static org.junit.Assert.fail;

import com.zzx.demo.order.mapper.OrderMasterMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zzx.demo.order.dto.OrderMaster;

import lombok.extern.slf4j.Slf4j;

/**
 * OrderMasterMapperTest
 * 
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterMapperTest {
	@Autowired
	private OrderMasterMapper orderMasterMapper;

	/**
	 * Test method for
	 * {@link OrderMasterMapper#deleteByPrimaryKey(java.lang.String)}.
	 */
	@Test
	public void testDeleteByPrimaryKey() {

	}

	/**
	 * Test method for
	 * {@link OrderMasterMapper#insert(com.zzx.demo.order.dto.OrderMaster)}.
	 */
	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link OrderMasterMapper#insertSelective(com.zzx.demo.order.dto.OrderMaster)}.
	 */
	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link OrderMasterMapper#selectByPrimaryKey(java.lang.String)}.
	 */
	@Test
	public void testSelectByPrimaryKey() {
		OrderMaster orderMaster = orderMasterMapper.selectByPrimaryKey("1528608013765692486");
		log.info("返回结果：{}", orderMaster);
	}

	/**
	 * Test method for
	 * {@link OrderMasterMapper#updateByPrimaryKeySelective(com.zzx.demo.order.dto.OrderMaster)}.
	 */
	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link OrderMasterMapper#updateByPrimaryKey(com.zzx.demo.order.dto.OrderMaster)}.
	 */
	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}
}
