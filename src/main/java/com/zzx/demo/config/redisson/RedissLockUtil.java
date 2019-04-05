/**
 * 
 */
package com.zzx.demo.config.redisson;

import java.util.concurrent.TimeUnit;

import org.redisson.api.RLock;

/**
 * RedissLockUtil
 * 
 * @author zhengzhongxian
 * @date 2019年4月1日
 * @description
 */
public class RedissLockUtil {
	private static DistributedLocker redissLock;

	public static void setLocker(DistributedLocker locker) {
		redissLock = locker;
	}

	/**
	 * 加锁
	 * 
	 * @param lockKey
	 * @return
	 */
	public static RLock lock(String lockKey) {
		return redissLock.lock(lockKey);
	}

	/**
	 * 释放锁
	 * 
	 * @param lockKey
	 */
	public static void unlock(String lockKey) {
		redissLock.unlock(lockKey);
	}

	/**
	 * 释放锁
	 * 
	 * @param lock
	 */
	public static void unlock(RLock lock) {
		redissLock.unlock(lock);
	}

	/**
	 * 带超时的锁
	 * 
	 * @param lockKey
	 * @param timeout 超时时间 单位：秒
	 */
	public static RLock lock(String lockKey, int timeout) {
		return redissLock.lock(lockKey, timeout);
	}

	/**
	 * 带超时的锁
	 * 
	 * @param lockKey
	 * @param unit    时间单位
	 * @param timeout 超时时间
	 */
	public static RLock lock(String lockKey, TimeUnit unit, int timeout) {
		return redissLock.lock(lockKey, unit, timeout);
	}

	/**
	 * 尝试获取锁 自动为锁延时（默认锁超时的时间是30秒，每隔10秒会自动重置锁超时的时间）
	 * 
	 * @param lockKey
	 * @return
	 */
	public static boolean tryLock(String lockKey) {
		return redissLock.tryLock(lockKey);
	}

	/**
	 * 尝试获取锁
	 * 
	 * @param lockKey
	 * @param waitTime  最多等待时间
	 * @param leaseTime 上锁后自动释放锁时间
	 * @return
	 */
	public static boolean tryLock(String lockKey, int waitTime, int leaseTime) {
		return redissLock.tryLock(lockKey, TimeUnit.SECONDS, waitTime, leaseTime);
	}

	/**
	 * 尝试获取锁(同步锁)
	 * 
	 * @param lockKey
	 * @param waitTime  最多等待时间
	 * @param leaseTime 上锁后自动释放锁时间
	 * @return
	 */
	public static boolean tryLockAsync(String lockKey, int waitTime, int leaseTime) {
		return redissLock.tryLockAsync(lockKey, TimeUnit.SECONDS, waitTime, leaseTime);
	}

	/**
	 * 尝试获取锁(不需等待)
	 * 
	 * @param lockKey
	 * @param leaseTime 上锁后自动释放锁时间
	 * @return
	 */
	public static boolean tryLockAsyncNoWait(String lockKey, int leaseTime) {
		return tryLockAsync(lockKey, 0, leaseTime);
	}

	/**
	 * 尝试获取锁(不需要等待)
	 * 
	 * @param lockKey
	 * @param leaseTime 上锁后自动释放锁时间
	 * @return
	 */
	public static boolean tryLock(String lockKey, int leaseTime) {
		return tryLock(lockKey, 0, leaseTime);
	}

	/**
	 * 尝试获取锁
	 * 
	 * @param lockKey
	 * @param unit      时间单位
	 * @param waitTime  最多等待时间
	 * @param leaseTime 上锁后自动释放锁时间
	 * @return
	 */
	public static boolean tryLock(String lockKey, TimeUnit unit, int waitTime, int leaseTime) {
		return redissLock.tryLock(lockKey, unit, waitTime, leaseTime);
	}
}
