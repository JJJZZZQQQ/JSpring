package com.jjjzzzqqq.springframework.beans.core.io;


/**
 * 按照资源加载的不同方式，资源加载器可以把这些方式集中到统一的ResourceLoader下
 * 进行处理，外部用户只需要传递资源地址即可，简化使用。
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
