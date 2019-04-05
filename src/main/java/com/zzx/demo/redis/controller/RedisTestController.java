/**
 * 
 */
package com.zzx.demo.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzx.demo.config.redisson.RedissLockUtil;
import com.zzx.demo.redis.bean.UserBean;
import com.zzx.demo.redis.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * RedisTestController
 * 
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description
 */
@RestController
@RequestMapping("/redis")
@Slf4j
public class RedisTestController {
	@Autowired
	private UserService userService;

	@RequestMapping("/getUserBean")
	public UserBean getUserBean(Integer id) {
		log.info("load1");
		return userService.find(id);
	}

	@RequestMapping("/redission")
	public String redission(Integer id) {
		String lockKey = "redission_lock";
//		log.info("分布式锁开始:{}", id);
		boolean lockresult = RedissLockUtil.tryLock(lockKey);
		if (!lockresult) {
			log.error("加锁失败:{}", id);
			return "加锁失败:" + id;
		}
		log.info("分布式锁加锁成功:{}", id);
//		try {
//			log.info("开始休眠:{}", id);
//			Thread.sleep(6000);
//			log.info("休眠结束:{}", id);
//		} catch (InterruptedException e) {
//			log.error("业务方法异常，异常信息:{}", e);
//		}
		RedissLockUtil.unlock(lockKey);
//		log.info("分布式锁结束:{}", id);
		return "分布式锁测试成功 : " + id;
	}

}
