/**
 *
 */
package com.zzx.demo.redis.controller;

import com.zzx.demo.config.redisson.RedissLockUtil;
import com.zzx.demo.redis.bean.UserBean;
import com.zzx.demo.redis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * redisson 缓存测试
     * @param id
     * @return
     */
    @RequestMapping("/getUserBean")
    public UserBean getUserBean(Integer id) {
        log.info("load1");
        return userService.find(id);
    }

    /**
     * redisson分布式锁
     * @param id
     * @return
     */
    @RequestMapping("/redisson")
    public String redisson(Integer id) {
        String lockKey = "redisson_lock";
        boolean lockresult = RedissLockUtil.tryLock(lockKey);
        if (!lockresult) {
            log.error("加锁失败:{}", id);
            return "加锁失败:" + id;
        }
        log.info("分布式锁加锁成功:{}", id);
        RedissLockUtil.unlock(lockKey);
        return "分布式锁测试成功 : " + id;
    }

}
