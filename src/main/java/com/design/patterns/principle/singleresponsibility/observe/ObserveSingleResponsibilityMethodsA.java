package com.design.patterns.principle.singleresponsibility.observe;

/**
 * 遵守职能单一的方式一
 * 细粒度拆分为一个一个的类
 * 优点：职能明确
 * 确定：改动较大，会产生多个类
 * @author Wangzhiwen
 */
public class ObserveSingleResponsibilityMethodsA {

    public static void main(String[] args) {
        new VehicleByWay().run("汽车");
        new VehicleBySky().run("飞机");
        new VehicleByWater().run("轮船");
    }

}

class VehicleByWay{
    public void run(String way){
        System.out.println( way + "在陆地上行驶...");
    }
}

class  VehicleBySky{
    public void run (String sky){
        System.out.println( sky + "在空中飞行...");
    }
}

class VehicleByWater{
    public void run(String water){
        System.out.println( water + "在水中行驶...");
    }
}
