package com.spring.day13.designpattern;

import java.nio.file.Path;

public abstract class Reporter {

    public void openFile(Path file) {
        System.out.println("Opening the file " + file.toFile().getName());
    }

    public void readFile(String text){
        System.out.println("Reading the file : " + text);
    }

    public void generateReport(Path file, String text) {
        openFile(file);
        appendHeader();
        appendText();
        appendFooter();
        readFile(text);
        close();

    }

    abstract void appendHeader();

    abstract void appendText();

    abstract void appendFooter();

    private void close() {
        System.out.println("Closing the  file...");
    }
}
