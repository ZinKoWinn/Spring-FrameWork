package com.day1.dao;

import com.day1.ds.FinancialMonthSummary;
import com.day1.ds.FinancialQuarterSummary;
import com.day1.ds.FinancialYearSummary;

public class FileStoreFinancialDataDao implements  FinancialDataDao{


    @Override
    public FinancialYearSummary findFinancialYearSummary(int year) {
        System.out.println("File Dao => findFinancialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
        System.out.println("File Dao => findFinancialQuarterSummary");
        return new FinancialQuarterSummary();
    }

    @Override
    public FinancialMonthSummary findFinancialMonthSummary(int month) {
        System.out.println("File Dao => findFinancialMonthSummary");
        return new FinancialMonthSummary();
    }
}
