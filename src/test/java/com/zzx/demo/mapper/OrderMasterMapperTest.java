/**
 *
 */
package com.zzx.demo.mapper;

import com.zzx.demo.order.dto.OrderMaster;
import com.zzx.demo.order.mapper.OrderMasterMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    }

    /**
     * Test method for
     * {@link OrderMasterMapper#insertSelective(com.zzx.demo.order.dto.OrderMaster)}.
     */
    @Test
    public void testInsertSelective() {
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
    }

    /**
     * Test method for
     * {@link OrderMasterMapper#updateByPrimaryKey(com.zzx.demo.order.dto.OrderMaster)}.
     */
    @Test
    public void testUpdateByPrimaryKey() {
    }
}
