package com.jjjzzzqqq.springframework.beans.factory.support;


import com.jjjzzzqqq.springframework.beans.factory.BeanFactory;
import com.jjjzzzqqq.springframework.beans.BeansException;
import com.jjjzzzqqq.springframework.beans.factory.config.BeanDefinition;

/**
 * AbstractBeanFactory：抽象Bean工厂，实现了BeanFactory接口，继承了DefaultSingletonBeanRegistry
 * 功能：
 * 1.BeanFactory的getBean方法，可以根据BeanName获取一个Bean对象（单例/原型）
 * 2.继承了DefaultSingletonBeanRegistry，拥有单例注册表的功能，可以获取一个单例Bean对象
 * 3.使用了模板方法的设计模式,createBean方法留给子类实现
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        //创建一个Bean
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;


    //public Object getSingleton(String beanName)


    //protected void addSingleton(String beanName, Object singletonObject)


}
