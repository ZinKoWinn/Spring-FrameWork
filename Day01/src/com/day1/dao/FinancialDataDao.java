package com.day1.dao;

import com.day1.ds.FinancialMonthSummary;
import com.day1.ds.FinancialQuarterSummary;
import com.day1.ds.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);
    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);
    FinancialMonthSummary findFinancialMonthSummary(int month);
}
