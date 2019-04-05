/**
 * 
 */
package com.zzx.demo.redis.service;

import com.zzx.demo.redis.bean.UserBean;

/**
 * UserService
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description 
 */
public interface UserService {
	UserBean find(Integer id);
}
