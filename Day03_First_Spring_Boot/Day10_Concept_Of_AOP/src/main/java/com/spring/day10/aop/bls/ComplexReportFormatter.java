package com.spring.day10.aop.bls;

import com.spring.day10.aop.annotation.CacheableLogger;
import com.spring.day10.aop.annotation.PerformanceLogger;
import com.spring.day10.aop.ds.FormattedReport;
import com.spring.day10.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class ComplexReportFormatter {
    @PerformanceLogger
    @CacheableLogger
    public FormattedReport formattedReport( Report report) throws InterruptedException {
        System.out.println("Formatting the report.....");
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("Report Formatted");
        return  new FormattedReport(report);
    }
}
