package com.herman.design.builder;

/**
 * @author herman
 * @create 2021-04-10 10:36
 **/
public class ComputerBuilder {

    public ComputerBuilder(Computer target) {
        this.target = target;
    }

    private Computer target = new Computer();

    public ComputerBuilder installDisplayer(String displayer) {
        target.setDisplayer(displayer);
        return this;
    }

    public ComputerBuilder installMainUnit(String mainUnit) {
        target.setMainUnit(mainUnit);
        return this;
    }

    public ComputerBuilder installMouse(String mouse) {
        target.setMouse(mouse);
        return this;
    }

    public ComputerBuilder installKeybord(String keyboard) {
        target.setKeyboard(keyboard);
        return this;
    }

    public Computer build() {
        return target;
    }


}
