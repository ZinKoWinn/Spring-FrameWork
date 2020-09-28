package com.day1.service;

import com.day1.dao.FinancialDataDao;
import com.day1.ds.FinancialMonthSummary;
import com.day1.ds.FinancialQuarterSummary;
import com.day1.ds.FinancialYearSummary;
import com.day1.writter.FinancialReportWriter;

public class SimpleFinancialReportService {

    private FinancialDataDao financialDataDao;
    private FinancialReportWriter financialReportWriter;

    public SimpleFinancialReportService(FinancialDataDao financialDataDao,FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void doGenerate(){
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2020);
        FinancialMonthSummary financialMonthSummary =  financialDataDao.findFinancialMonthSummary(3);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2020,4);
        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);

    }

}
