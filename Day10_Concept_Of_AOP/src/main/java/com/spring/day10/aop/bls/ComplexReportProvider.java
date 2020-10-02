package com.spring.day10.aop.bls;

import com.spring.day10.aop.annotation.CacheableLogger;
import com.spring.day10.aop.annotation.PerformanceLogger;
import com.spring.day10.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class ComplexReportProvider {
    @PerformanceLogger
    @CacheableLogger
    public Report getReport() throws InterruptedException {
        System.out.println("Fetching the report.......");
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Report Created");
        return  new Report();
    }
}
