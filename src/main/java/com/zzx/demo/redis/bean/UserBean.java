/**
 * 
 */
package com.zzx.demo.redis.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Userbean
 * @author zhengzhongxian
 * @date 2019年3月30日
 * @description 
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserBean implements Serializable {
    private String name;
    private Integer age;
}


