package com.jjjzzzqqq.springframework.beans.factory.support;


import com.jjjzzzqqq.springframework.beans.BeansException;
import com.jjjzzzqqq.springframework.beans.core.io.Resource;
import com.jjjzzzqqq.springframework.beans.core.io.ResourceLoader;

/**
 * Bean 定义读取接口
 * 职责：各种读取Bean的功能
 * 前两个方法是提供给后三个方法的工具类
 * 此处由抽象类实现,防止接口被污染
 *
 */
public interface BeanDefinitionReader {

    //获取Bean定义注册表
    BeanDefinitionRegistry getRegistry();

    //获取资源加载器
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
