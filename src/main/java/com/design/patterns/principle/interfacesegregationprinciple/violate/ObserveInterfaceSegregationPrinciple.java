package com.design.patterns.principle.interfacesegregationprinciple.violate;

/**
 * 违反接口隔离原则
 * 场景：
 *      1、有一个较大的接口DemoInterface，里面有五个功能方法。
 *      2、类B实现接口
 *      3、类D实现接口
 *      4、类A依赖接口DemoInterface（类B），但只使用到了接口的1，2，3方法
 *      5、类C依赖接口DemoInterface（类C），但只使用到了接口的1,4，5方法
 *
 * 缺点：功能耦合，类A实际不需要接口中的4,5方法，但由于B实现了接口所以被依赖过来了。类C一样
 *
 * @author Wangzhiwen
 */
public class ObserveInterfaceSegregationPrinciple {

    public static void main(String[] args) {
        A a = new A();
        DemoInterface b = new B();
        a.method1(b);
        a.method2(b);
        a.method3(b);

        C c = new C();
        DemoInterface d = new D();
        c.method1(d);
        c.method4(d);
        c.method5(d);

    }
}

class A{
    public void method1(DemoInterface demoInterface){
        demoInterface.method1();
    }

    public void method2(DemoInterface demoInterface){
        demoInterface.method2();
    }

    public void method3(DemoInterface demoInterface){
        demoInterface.method3();
    }
}

class C{
    public void method1(DemoInterface demoInterface){
        demoInterface.method1();
    }

    public void method4(DemoInterface demoInterface){
        demoInterface.method4();
    }

    public void method5(DemoInterface demoInterface){
        demoInterface.method5();
    }
}


interface DemoInterface{
    void method1();

    void method2();

    void method3();

    void method4();

    void method5();
}


class B implements DemoInterface{

    @Override
    public void method1() {
        System.out.println("类B实现了方法1");
    }

    @Override
    public void method2() {
        System.out.println("类B实现了方法2");
    }

    @Override
    public void method3() {
        System.out.println("类B实现了方法3");
    }

    @Override
    public void method4() {
        System.out.println("类B实现了方法4");
    }

    @Override
    public void method5() {
        System.out.println("类B实现了方法5");
    }
}

class D implements DemoInterface{

    @Override
    public void method1() {
        System.out.println("类C实现了方法1");
    }

    @Override
    public void method2() {
        System.out.println("类C实现了方法2");
    }

    @Override
    public void method3() {
        System.out.println("类C实现了方法3");
    }

    @Override
    public void method4() {
        System.out.println("类C实现了方法4");
    }

    @Override
    public void method5() {
        System.out.println("类C实现了方法6");
    }
}