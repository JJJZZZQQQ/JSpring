package com.jjjzzzqqq.springframework.beans.factory.config;

/**
 * 单例Bean注册表
 * 职责：
 * 如果一个Bean是单例Bean，那么可以通过该注册表获取该单例Bean
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
