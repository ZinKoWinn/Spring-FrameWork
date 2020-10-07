package com.spring.day13.designpattern;

public class PdfReport extends  Reporter{
    @Override
    void appendHeader() {
        System.out.println("Appending Pdf Header ");
    }

    @Override
    void appendText() {
        System.out.println("Appending Pdf Text ");
    }

    @Override
    void appendFooter() {
        System.out.println("Appending Pdf Footer ");
    }
}
