package com.spring.day5;

import com.spring.day5.dao.FinancialDataDao;
import com.spring.day5.service.FinancialReportService;
import com.spring.day5.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DatabaseConfiguration.class,FileConfiguration.class})
public class ApplicationConfiguration {
    @Bean
    FinancialReportService financialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter){
        return  new FinancialReportService(financialDataDao,financialReportWriter);
    }
}
