package com.jjjzzzqqq.springframework.beans.factory.support;


import com.jjjzzzqqq.springframework.beans.core.io.DefaultResourceLoader;
import com.jjjzzzqqq.springframework.beans.core.io.ResourceLoader;

/**
 * 抽象Bean定义读取器类
 * 职责：实现了两个工具方法
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
