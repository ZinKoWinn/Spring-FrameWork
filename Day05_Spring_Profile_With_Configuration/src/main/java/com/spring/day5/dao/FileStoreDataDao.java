package com.spring.day5.dao;

import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;

public class FileStoreDataDao implements  FinancialReportDao{
    @Override
    public FinancialYearSummary financialYearSummary(int year) {
        System.out.println("File Dao :: financialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialMonthSummary financialMonthSummary(int month) {
        System.out.println("File Dao : financialMonthSummary");
        return new FinancialMonthSummary();
    }

    @Override
    public FinancialQuarterSummary financialQuarterSummary(int year, int quarter) {
        System.out.println("File Dao :: financialQuarterSummary");
        return new FinancialQuarterSummary();
    }
}
