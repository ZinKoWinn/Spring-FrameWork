package com.spring.day11;

public class Main {

    public static void main(String[] args) {
        IInterface iInterface = new ProxyClass(new TargetClass());
        iInterface.doSomething();

    }
}
