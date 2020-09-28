package com.spring.day5;

import com.spring.day5.dao.DatabaseStoreDataDao;
import com.spring.day5.dao.FileStoreDataDao;
import com.spring.day5.dao.FinancialReportDao;
import com.spring.day5.service.FinancialReportService;
import com.spring.day5.writer.DatabaseStoreReportWriter;
import com.spring.day5.writer.FileStoreReportWriter;
import com.spring.day5.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
public class ApplicationConfiguration {
    @Bean
    public FinancialReportService financialReportService(FinancialReportDao financialReportDao, FinancialReportWriter financialReportWriter){
        return  new FinancialReportService(financialReportDao,financialReportWriter);
    }

    @Bean
    @Profile("database")
    public FinancialReportDao databaseStoreFinancialReportDao(){
        return  new DatabaseStoreDataDao();
    }
    @Bean
    @Profile("file")
    public FinancialReportDao fileStoreFinancialReportDao(){
        return  new FileStoreDataDao();
    }
    @Bean
    @Profile("database")
    public FinancialReportWriter databaseStoreFinancialReportWriter(){
        return new DatabaseStoreReportWriter();
    }
    @Bean
    @Profile("file")
    public FinancialReportWriter fileStoreFinancialReportWriter(){
        return new FileStoreReportWriter();
    }
}
