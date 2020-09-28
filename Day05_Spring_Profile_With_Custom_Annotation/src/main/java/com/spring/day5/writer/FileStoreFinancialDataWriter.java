package com.spring.day5.writer;

import com.spring.day5.annotation.FileConfiguration;
import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@FileConfiguration
public class FileStoreFinancialDataWriter implements  FinancialDataWriter{
    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("File Writer :: appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("File Writer :: appendFinancialMonthSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("File Writer :: appendFinancialQuarterSummary");
    }
}
