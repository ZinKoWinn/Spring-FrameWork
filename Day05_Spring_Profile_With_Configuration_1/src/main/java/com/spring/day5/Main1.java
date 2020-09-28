package com.spring.day5;

import com.spring.day5.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        context.getEnvironment().setActiveProfiles("database");
        context.register(ApplicationConfiguration.class);
        context.refresh();

        FinancialReportService financialReportService = context.getBean(FinancialReportService.class);
        financialReportService.generateReport();
    }
}
