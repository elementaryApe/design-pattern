package com.herman.design.jdkDynamicProxy;

/**
 * jdk动态代理：给某一个对象提供一个代理,并由代理对象控制对原对象的引用,
 * 在java的java.lang.reflect包下提供了一个Proxy类和一个InvocationHandler接口
 *
 * @author herman
 * @create 2021-04-10 11:43
 **/
public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        System.out.println ("不使用代理类,调用dosomething方法。");//不使用代理类
        Person person = new Herman();//调用doSomething方法person.dosomething();
        person.doSomething();
        System.out.println("使用代理类,调用dosomething方法。");
        //获取代理类
        Person proxyPerson = new JDKDynamicProxy(new Herman()).getTarget();//调用doSomething方法
        proxyPerson.doSomething();

    }
}
