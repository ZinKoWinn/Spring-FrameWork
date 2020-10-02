package com.spring.day10.aop.bls;

import com.spring.day10.aop.annotation.CacheableLogger;
import com.spring.day10.aop.annotation.PerformanceLogger;
import com.spring.day10.aop.ds.FormattedReport;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class ComplexReportRepository {

    @PerformanceLogger
    @CacheableLogger
   public void save(FormattedReport formattedReport) throws InterruptedException {
        System.out.println("Saving the report.........");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report Saved ");
}
}
