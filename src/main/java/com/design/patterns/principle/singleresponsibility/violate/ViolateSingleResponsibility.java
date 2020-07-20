package com.design.patterns.principle.singleresponsibility.violate;

/**
 * 违反单一职责原则
 * @author Wangzhiwen
 */
public class ViolateSingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("公交车");
        vehicle.run("坦克");
        vehicle.run("飞机");
    }

}

/**
 * 交通工具
 */
class Vehicle{

    /**
     * 交通工具的运行功能，职能不单一
     * 所有类型车辆都是这个功能
     */
    public void run(String vehicle){
        System.out.println(vehicle + "在陆地上运行。。。。");
    }

}
