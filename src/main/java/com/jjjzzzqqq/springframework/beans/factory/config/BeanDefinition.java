package com.jjjzzzqqq.springframework.beans.factory.config;

/**
 * BeanDefintion对象
 * 表示一个Bean的描述信息
 * 类信息
 * 模式信息：单例/原型
 * ......
 */
public class BeanDefinition {

    private Class beanClass;


    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
