package com.spring.day9.no.aop.action;

import com.spring.day9.no.aop.bls.ComplexReportFormatter;
import com.spring.day9.no.aop.bls.ComplexReportProvider;
import com.spring.day9.no.aop.bls.ComplexReportRepository;
import com.spring.day9.no.aop.ds.FormattedReport;
import com.spring.day9.no.aop.ds.Report;
import com.spring.day9.no.aop.logger.PerformanceLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ComplexReportAction {
    @Autowired
   private ComplexReportProvider complexReportProvider;
    @Autowired
   private ComplexReportFormatter complexReportFormatter;
    @Autowired
   private ComplexReportRepository complexReportRepository;
    @Autowired
    private PerformanceLogger performanceLogger;

    public void perform() throws  InterruptedException{
        PerformanceLogger.PerformanceLoggerInfo performanceLoggerInfo;
        performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
        Report report = complexReportProvider.getReport();
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("comPlexReportFormatter.formattedReport()");
        FormattedReport formattedReport = complexReportFormatter.formattedReport(report);
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportRepository.save()");
        complexReportRepository.save(formattedReport);
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
       report = complexReportProvider.getReport();
        performanceLogger.stop(performanceLoggerInfo);



    }
}
