/**
 * 
 */
package com.zzx.demo.redis.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.zzx.demo.redis.bean.UserBean;
import com.zzx.demo.redis.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * UserServiceImpl
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description 
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
    private StringRedisTemplate stringRedisTemplate;
    
	@Override
	@Cacheable(value = "users", key = "'id_' + #id")
	public UserBean find(Integer id) {
	    log.info("load2开始");
	    UserBean u=UserBean.builder().
	            name("name"+new Random().nextInt(1000))
	            .age(new Random().nextInt(100)).build();
	    log.info("load2结束");
	    return u;
	}

}
