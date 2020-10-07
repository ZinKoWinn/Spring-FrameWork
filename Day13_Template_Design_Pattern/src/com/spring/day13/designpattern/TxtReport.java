package com.spring.day13.designpattern;

public class TxtReport extends  Reporter{
    @Override
    void appendHeader() {
        System.out.println("Appending Txt Header ");
    }

    @Override
    void appendText() {
        System.out.println("Appending Txt Text ");
    }

    @Override
    void appendFooter() {
        System.out.println("Appending Footer Text ");
    }
}
