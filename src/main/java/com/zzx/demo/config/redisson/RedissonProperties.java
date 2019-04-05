/**
 * 
 */
package com.zzx.demo.config.redisson;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * RedissonProperties
 * 
 * @author zhengzhongxian
 * @date 2019年4月1日
 * @description
 */
//@Configuration 注意：RedissonAutoConfiguration.java上面已经添加了@EnableConfigurationProperties(RedissonProperties.class)，这里一定不要在添加@Configuration注解。两者只能二选一
@ConfigurationProperties(prefix = "redisson")
@ConditionalOnProperty("redisson.password")
public class RedissonProperties {

	private int timeout = 3000;

	private String address;

	private String password;

	private int database = 0;

	private int connectionPoolSize = 64;

	private int connectionMinimumIdleSize = 10;

	private int slaveConnectionPoolSize = 250;

	private int masterConnectionPoolSize = 250;

	private String[] sentinelAddresses;

	private String masterName;

	private long ttl = 24 * 60 * 1000;

	private long maxIdleTime = 12 * 60 * 1000;

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getSlaveConnectionPoolSize() {
		return slaveConnectionPoolSize;
	}

	public void setSlaveConnectionPoolSize(int slaveConnectionPoolSize) {
		this.slaveConnectionPoolSize = slaveConnectionPoolSize;
	}

	public int getMasterConnectionPoolSize() {
		return masterConnectionPoolSize;
	}

	public void setMasterConnectionPoolSize(int masterConnectionPoolSize) {
		this.masterConnectionPoolSize = masterConnectionPoolSize;
	}

	public String[] getSentinelAddresses() {
		return sentinelAddresses;
	}

	public void setSentinelAddresses(String sentinelAddresses) {
		this.sentinelAddresses = sentinelAddresses.split(",");
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getConnectionPoolSize() {
		return connectionPoolSize;
	}

	public void setConnectionPoolSize(int connectionPoolSize) {
		this.connectionPoolSize = connectionPoolSize;
	}

	public int getConnectionMinimumIdleSize() {
		return connectionMinimumIdleSize;
	}

	public void setConnectionMinimumIdleSize(int connectionMinimumIdleSize) {
		this.connectionMinimumIdleSize = connectionMinimumIdleSize;
	}

	public int getDatabase() {
		return database;
	}

	public void setDatabase(int database) {
		this.database = database;
	}

	public void setSentinelAddresses(String[] sentinelAddresses) {
		this.sentinelAddresses = sentinelAddresses;
	}

	public long getTtl() {
		return ttl;
	}

	public void setTtl(long ttl) {
		this.ttl = ttl;
	}

	public long getMaxIdleTime() {
		return maxIdleTime;
	}

	public void setMaxIdleTime(long maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
	}
}
