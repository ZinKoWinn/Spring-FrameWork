package com.day1.writter;

import com.day1.ds.FinancialMonthSummary;
import com.day1.ds.FinancialQuarterSummary;
import com.day1.ds.FinancialYearSummary;

public class FileFinancialReportWriter implements  FinancialReportWriter{
    @Override
    public void appendFreeText(String title) {

        System.out.println("File Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("File Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("File Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("File Writer => appendFinancialMonthSummary");
    }
}
