package com.design.patterns.principle.singleresponsibility.observe;

/**
 * 遵守职能单一的方式二
 * 细粒度的在方法级别保持职能单一，特定的方法只做特定的事
 * 优点：保持职能单一
 * 缺点：方法级别的职能单一只有在逻辑足够简单时才允许
 * @author Wangzhiwen
 */
public class ObserveSingleResponsibilityMethodsB {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runAsWay("汽车");
        vehicle.runAsSky("飞机");
        vehicle.runAsWater("轮船");
    }

}

class Vehicle{
    public void runAsWay(String way){
        System.out.println("陆地");
    }

    public void runAsSky(String sky){
        System.out.println("天空");
    }

    public void runAsWater(String water){
        System.out.println("水中");
    }
}
