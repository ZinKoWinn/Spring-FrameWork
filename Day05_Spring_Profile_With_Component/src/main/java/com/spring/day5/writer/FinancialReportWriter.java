package com.spring.day5.writer;

import com.spring.day5.ds.FinancialMonthSummary;
import com.spring.day5.ds.FinancialQuarterSummary;
import com.spring.day5.ds.FinancialYearSummary;

public interface FinancialReportWriter {
    void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);
    void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);
    void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);
}
