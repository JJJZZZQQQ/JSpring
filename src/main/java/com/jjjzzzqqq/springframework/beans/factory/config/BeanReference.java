package com.jjjzzzqqq.springframework.beans.factory.config;

/**
 * Bean 的引用
 * 用来标识一个Bean的内部Bean
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
