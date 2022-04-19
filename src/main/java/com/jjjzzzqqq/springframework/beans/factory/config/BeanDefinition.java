package com.jjjzzzqqq.springframework.beans.factory.config;

import com.jjjzzzqqq.springframework.beans.PropertyValue;
import com.jjjzzzqqq.springframework.beans.PropertyValues;

/**
 * BeanDefintion对象
 * 表示一个Bean的描述信息
 * 类信息
 * 模式信息：单例/原型
 * ......
 */
public class BeanDefinition {

    private Class beanClass;

    /**
     * Bean的属性信息
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

}
