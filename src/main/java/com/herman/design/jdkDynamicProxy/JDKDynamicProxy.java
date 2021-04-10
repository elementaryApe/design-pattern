package com.herman.design.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理类实现InvocationHandler接口
 *
 * @author herman
 * @create 2021-04-10 11:47
 **/
public class JDKDynamicProxy implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Person target;

    public JDKDynamicProxy(Person target) {
        this.target = target;
    }

    // 获取代理对象
    public Person getTarget() {
        //类加载器 class  代理类
        return (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }


    /**
     * 生成的代理实例调用方法时会回调该接口
     * @param proxy 代理对象
     * @param method 方法
     * @param args 参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDKDynamicProxy do something before!");
        Person result = (Person) method.invoke(target, args);
        System.out.println("JDKDynamicProxy do something after!");
        return result;
    }
}
