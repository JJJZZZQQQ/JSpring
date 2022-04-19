package com.jjjzzzqqq.springframework.beans.factory.support;

import com.jjjzzzqqq.springframework.beans.BeansException;
import com.jjjzzzqqq.springframework.beans.factory.config.BeanDefinition;

/**
 * 一个能够自动装配Bean的抽象工厂类
 * 职责：
 * 1.重写了AbstractBeanFactory的createBean方法，这个抽象类现在可以真正的获取一个Bean了，通过getBean方法
 * 2.完成自动装配Bean的逻辑处理
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 创建一个Bean
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of com.jjjzzzqqq.springframework.test.bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }



}
