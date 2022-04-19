package com.jjjzzzqqq.springframework.beans.factory.support;



import com.jjjzzzqqq.springframework.beans.BeansException;
import com.jjjzzzqqq.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认Bean工厂实现类
 * 功能：
 * 1.继承了AbstractAutowireCapableBeanFactory，拥有创建，获取，添加Bean，获取添加单例Bean的功能
 * 2.实现了BeanDefinitionRegistry接口，可以注册一个BeanDefinition
 * 3.该类就是一个简单版的拥有容器功能的BeanFactory实现类
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No com.jjjzzzqqq.springframework.test.bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

}
