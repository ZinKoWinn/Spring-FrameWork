package com.spring.day5;

import com.spring.day5.dao.DatabaseStoreFinancialDataDao;
import com.spring.day5.dao.FinancialDataDao;
import com.spring.day5.writer.DatabaseStoreFinancialReportWriter;
import com.spring.day5.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("database")
public class DatabaseConfiguration {
    @Bean
     FinancialDataDao databaseStoreFinancialDataDao(){
        return new DatabaseStoreFinancialDataDao();
     }
     @Bean
     FinancialReportWriter databaseStoreFinancialReportWriter(){
        return  new DatabaseStoreFinancialReportWriter();
     }
}
