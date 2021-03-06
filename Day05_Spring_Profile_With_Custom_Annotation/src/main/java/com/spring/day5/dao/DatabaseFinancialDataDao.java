package com.spring.day5.dao;

import com.spring.day5.annotation.DatabaseConfiguration;
import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;
import org.springframework.stereotype.Component;

@Component
@DatabaseConfiguration
public class DatabaseFinancialDataDao implements  FinancialDataDao{
    @Override
    public FinancialYearSummary financialYearSummary(int year) {
        System.out.println("Database Dao :: financialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialMonthSummary financialMonthSummary(int month) {
        System.out.println("Database Dao :: financialMonthSummary");
        return new FinancialMonthSummary();
    }

    @Override
    public FinancialQuarterSummary financialQuarterSummary(int year, int quarter) {
        System.out.println("Database Dao :: financialQuarterSummary");
        return new FinancialQuarterSummary();
    }
}
