package com.herman.design.builder;

/**
 * 构建者模式：使用多个简单的对象一步一步构建成一个复杂的对象
 *
 * @author herman
 * @create 2021-04-10 10:33
 **/
public class BuilderTest {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder(new Computer());
        computerBuilder.installDisplayer("显卡");
        computerBuilder.installKeybord("键盘");
        computerBuilder.installMainUnit("主机");
        computerBuilder.installMouse("鼠标");

        Computer build = computerBuilder.build();
        System.out.println(build.toString());
    }
}
