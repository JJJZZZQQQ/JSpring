package com.jjjzzzqqq.springframework.beans.factory.support;


import com.jjjzzzqqq.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition 注册表
 * 职责：注册一个 BeanDefinition
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
