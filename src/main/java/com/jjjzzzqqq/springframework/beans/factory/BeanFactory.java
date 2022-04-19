package com.jjjzzzqqq.springframework.beans.factory;


import com.jjjzzzqqq.springframework.beans.BeansException;

/**
 * Bean工厂
 * 职责：根据BeanName获取一个Bean,可以是原型Bean,也可以是单例Bean
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    //Object getBean(String name, Object... args) throws BeansException;
}
