package com.spring.day5.service;

import com.spring.day5.annotation.DatabaseConfiguration;
import com.spring.day5.dao.FinancialDataDao;
import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;
import com.spring.day5.writer.FinancialDataWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {
    @Autowired
    private FinancialDataDao financialDataDao;
    @Autowired
    private FinancialDataWriter financialDataWriter;

    public FinancialReportService(FinancialDataDao financialDataDao, FinancialDataWriter financialDataWriter) {
        this.financialDataDao = financialDataDao;
        this.financialDataWriter = financialDataWriter;
    }

    public void generateReport(){
        FinancialYearSummary financialYearSummary = financialDataDao.financialYearSummary(2020);
        FinancialMonthSummary financialMonthSummary = financialDataDao.financialMonthSummary(6);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.financialQuarterSummary(2020,6);

        financialDataWriter.appendFinancialYearSummary(financialYearSummary);
        financialDataWriter.appendFinancialMonthSummary(financialMonthSummary);
        financialDataWriter.appendFinancialQuarterSummary(financialQuarterSummary);
    }


}
