package com.spring.day5.service;

import com.spring.day5.dao.FinancialDataDao;
import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;
import com.spring.day5.writer.FinancialReportWriter;

public class FinancialReportService {
    private FinancialDataDao financialDataDao;
    private FinancialReportWriter financialReportWriter;

    public FinancialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void generateReport(){
        FinancialYearSummary financialYearSummary = financialDataDao.financialYearSummary(2020);
        FinancialMonthSummary financialMonthSummary = financialDataDao.financialMonthSummary(5);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.financialQuarterSummary(2020,5);

        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
    }
}
