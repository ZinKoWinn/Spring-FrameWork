package com.day1.writter;

import com.day1.ds.FinancialMonthSummary;
import com.day1.ds.FinancialQuarterSummary;
import com.day1.ds.FinancialYearSummary;

public interface FinancialReportWriter {

    void appendFreeText(String title);
    void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);
    void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);
    void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);
}
