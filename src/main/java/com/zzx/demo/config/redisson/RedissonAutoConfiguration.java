/**
 *
 */
package com.zzx.demo.config.redisson;

import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.spring.cache.CacheConfig;
import org.redisson.spring.cache.RedissonSpringCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * RedissonAutoConfiguration
 *
 * @author zhengzhongxian
 * @date 2019年4月1日
 * @description
 */
@Configuration
@ConditionalOnClass(Config.class)
@EnableConfigurationProperties(RedissonProperties.class)
public class RedissonAutoConfiguration {

    @Autowired
    private RedissonProperties redssionProperties;

    /**
     * 哨兵模式自动装配
     *
     * @return
     */
//    @Bean
//    @ConditionalOnProperty(name = "redisson.master-name")
//    RedissonClient redissonSentinel() {
//        Config config = new Config();
//        SentinelServersConfig serverConfig = config.useSentinelServers()
//                .addSentinelAddress(redssionProperties.getSentinelAddresses())
//                .setMasterName(redssionProperties.getMasterName()).setTimeout(redssionProperties.getTimeout())
//                .setMasterConnectionPoolSize(redssionProperties.getMasterConnectionPoolSize())
//                .setSlaveConnectionPoolSize(redssionProperties.getSlaveConnectionPoolSize());
//
//        if (StringUtils.isNotBlank(redssionProperties.getPassword())) {
//            serverConfig.setPassword(redssionProperties.getPassword());
//        }
//        return Redisson.create(config);
//    }

    /**
     * 单机模式自动装配
     *
     * @return
     */
//    @Bean
//    @ConditionalOnProperty(name = "redisson.address")
//    RedissonClient redissonSingle() {
//        Config config = new Config();
//        SingleServerConfig serverConfig = config.useSingleServer().setAddress(redssionProperties.getAddress())
//                .setTimeout(redssionProperties.getTimeout())
//                .setConnectionPoolSize(redssionProperties.getConnectionPoolSize())
//                .setConnectionMinimumIdleSize(redssionProperties.getConnectionMinimumIdleSize());
//
//        if (StringUtils.isNotBlank(redssionProperties.getPassword())) {
//            serverConfig.setPassword(redssionProperties.getPassword());
//        }
//
//        return Redisson.create(config);
//    }

    /**
     * 装配locker类，并将实例注入到RedissLockUtil中
     *
     * @return
     */
    @Bean
    DistributedLocker distributedLocker(RedissonClient redissonClient) {
        DistributedLocker locker = new RedissonDistributedLocker();
        locker.setRedissonClient(redissonClient);
        RedissLockUtil.setLocker(locker);
        return locker;
    }

    /**
     * redisson缓存
     * @param redissonClient
     * @return
     */
    @Bean
    CacheManager cacheManager(RedissonClient redissonClient) {
        Map<String, CacheConfig> config = new HashMap<>(16);
        // create "testMap" cache with ttl = 24 minutes and maxIdleTime = 12 minutes
        config.put("cfgMap", new CacheConfig(redssionProperties.getTtl(), redssionProperties.getMaxIdleTime()));
        return new RedissonSpringCacheManager(redissonClient, config);
    }

}
