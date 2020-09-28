package com.spring.day5.service;

import com.spring.day5.dao.FinancialReportDao;
import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;
import com.spring.day5.writer.FinancialReportWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {
    @Autowired
    private FinancialReportDao financialReportDao;
    @Autowired
    private FinancialReportWriter financialReportWriter;

    FinancialReportService(FinancialReportDao financialReportDao, FinancialReportWriter financialReportWriter){
        this.financialReportDao = financialReportDao;
        this.financialReportWriter = financialReportWriter;
    }


    public void generateReport(){
        FinancialYearSummary financialYearSummary = financialReportDao.financialYearSummary(2020);
        FinancialMonthSummary financialMonthSummary = financialReportDao.financialMonthSummary(4);
        FinancialQuarterSummary financialQuarterSummary = financialReportDao.financialQuarterSummary(2020,4);

        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
    }

}
