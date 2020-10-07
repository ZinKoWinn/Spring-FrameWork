package com.spring.day13;

import com.spring.day13.designpattern.PdfReport;
import com.spring.day13.designpattern.TxtReport;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        new PdfReport().generateReport(Paths.get("Lean java.pdf"),"Java is a strong type programming.");

        new TxtReport().generateReport(Paths.get("Lean Java.txt"),"Java is a Object Oriented Programming.");
    }
}
