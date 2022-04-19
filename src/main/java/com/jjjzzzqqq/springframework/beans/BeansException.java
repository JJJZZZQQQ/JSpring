package com.jjjzzzqqq.springframework.beans;

/**
 * 自定义异常类
 * Beans包下的异常处理类
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}