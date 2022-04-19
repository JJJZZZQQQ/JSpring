package com.jjjzzzqqq.springframework.beans.factory.support;



import com.jjjzzzqqq.springframework.beans.factory.config.SingletonBeanRegistry;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例Bean注册表的默认实现类
 * 功能：
 * 1.获取单例Bean
 * 2.添加一个单例Bean到 singletonObjects单例池
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
