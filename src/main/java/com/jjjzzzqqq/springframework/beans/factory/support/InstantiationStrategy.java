package com.jjjzzzqqq.springframework.beans.factory.support;


import com.jjjzzzqqq.springframework.beans.BeansException;
import com.jjjzzzqqq.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略接口
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
