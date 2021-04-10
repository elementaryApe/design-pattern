package com.herman.design.staticFactory;

/**
 * 静态工厂方法:在简单工厂模式中,可以根据参数的不同返回不同类的实例。简单工厂模式专门定义一个类来负责创建其他类的实例,被创建的实例通常都具有共同的父类
 *
 * @author herman
 * @create 2021-04-10 11:28
 **/
public class StaticFactoryTest {

    public static void main(String[] args) {

        Computer xm = ComputerFactory.createComputer("xm");
        xm.start();
        Computer hp = ComputerFactory.createComputer("hp");
        hp.start();
    }
}
