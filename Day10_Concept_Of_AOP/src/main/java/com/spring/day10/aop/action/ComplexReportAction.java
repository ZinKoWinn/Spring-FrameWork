package com.spring.day10.aop.action;

import com.spring.day10.aop.bls.ComplexReportFormatter;
import com.spring.day10.aop.bls.ComplexReportProvider;
import com.spring.day10.aop.bls.ComplexReportRepository;
import com.spring.day10.aop.ds.FormattedReport;
import com.spring.day10.aop.ds.Report;
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

    public  void perform()throws  InterruptedException{
        Report report = complexReportProvider.getReport();
        FormattedReport formattedReport = complexReportFormatter.formattedReport(report);
        complexReportRepository.save(formattedReport);
        report = complexReportProvider.getReport();
    }
}
