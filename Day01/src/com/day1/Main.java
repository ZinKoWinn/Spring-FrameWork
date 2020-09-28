package com.day1;

import com.day1.dao.DatabaseStoreFinancialDataDao;
import com.day1.service.SimpleFinancialReportService;
import com.day1.writter.DatabaseFinancialReportWriter;

public class Main {

    public static void main(String[] args) {
        SimpleFinancialReportService service = new SimpleFinancialReportService(new DatabaseStoreFinancialDataDao(),new DatabaseFinancialReportWriter());
        service.doGenerate();
    }
}
