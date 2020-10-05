package com.spring.day11;

public class ProxyClass implements  IInterface{
    private TargetClass targetClass;

    public ProxyClass(TargetClass targetClass) {
        this.targetClass = targetClass;
    }

    @Override
    public void doSomething() {
        doSomethingExtra();
        targetClass.doSomething();
    }

    public void doSomethingExtra(){
        System.out.println("Proxy :: doSomethingExtra");
    }
}
