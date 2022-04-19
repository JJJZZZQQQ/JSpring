package com.jjjzzzqqq.springframework.beans.factory.support;

import com.jjjzzzqqq.springframework.beans.BeansException;
import com.jjjzzzqqq.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 一个能够自动装配Bean的抽象工厂类
 * 职责：
 * 1.重写了AbstractBeanFactory的createBean方法，这个抽象类现在可以真正的获取一个Bean了，通过getBean方法
 * 2.完成自动装配Bean的逻辑处理
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    /**
     * 创建一个Bean
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        //类的构造器集合
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();

        //判断哪一个构造器的参数列表与给定的参数列表相同
        //todo 此处只简单判断了参数个数，应该还要判断具体的参数类型是否相同
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
