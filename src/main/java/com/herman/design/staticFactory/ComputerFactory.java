package com.herman.design.staticFactory;

/**
 * 工厂类
 *
 * @author herman
 * @create 2021-04-10 11:32
 **/
public class ComputerFactory {

    /**
     * 电脑生产方法
     *
     * @param type 电脑类型
     */
    public static Computer createComputer(String type) {
        Computer mComputer = null;
        if (type.equals("xm")) {
            mComputer = new XiaoMiComputer();

        } else if (type.equals("hp")) {
            mComputer = new HpComputer();

        }
        return mComputer;
    }
}
