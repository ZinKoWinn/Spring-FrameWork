package com.spring.day5.dao;

import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary financialYearSummary(int year);
    FinancialMonthSummary financialMonthSummary(int month);
    FinancialQuarterSummary financialQuarterSummary(int year, int quarter);

}
