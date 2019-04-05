/**
 * 
 */
package com.zzx.demo.config.redisson;

import java.util.concurrent.TimeUnit;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

/**
 * DistributedLocker
 * 
 * @author zhengzhongxian
 * @date 2019年4月1日
 * @description
 */
public interface DistributedLocker {

	RLock lock(String lockKey);

	RLock lock(String lockKey, int timeout);

	RLock lock(String lockKey, TimeUnit unit, int timeout);

	boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime);

	boolean tryLockAsync(String lockKey, TimeUnit unit, int waitTime, int leaseTime);

	boolean tryLock(String lockKey);

	void unlock(String lockKey);

	void unlock(RLock lock);

	void setRedissonClient(RedissonClient redissonClient);
}
