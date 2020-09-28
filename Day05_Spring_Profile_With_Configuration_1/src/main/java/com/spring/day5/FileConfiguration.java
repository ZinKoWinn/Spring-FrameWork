package com.spring.day5;

import com.spring.day5.dao.FileStoreFinancialDataDao;
import com.spring.day5.dao.FinancialDataDao;
import com.spring.day5.writer.FileStoreFinancialReportWriter;
import com.spring.day5.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("file")
public class FileConfiguration {
    @Bean
    FinancialDataDao fileStoreFinancialDataDao(){
        return new FileStoreFinancialDataDao();
    }
    @Bean
    FinancialReportWriter fileStoreFinancialReportWriter(){
        return  new FileStoreFinancialReportWriter();
    }
}
