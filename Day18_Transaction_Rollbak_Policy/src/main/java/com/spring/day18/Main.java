package com.spring.day18;

import com.spring.day18.service.DataSourceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.registerShutdownHook();

        DataSourceService dataSourceService = context.getBean(DataSourceService.class);

        try {
            dataSourceService.methodWithUnCheckExceptionCausingRollBack();
        } catch (Exception e) {
            System.out.println(String.format("Exception thrown : %s : %s \n\n", e.getClass().getSimpleName(), e.getMessage()));
        }

        try {
            dataSourceService.methodWithCheckExceptionNotCauseRollback();
        } catch (Exception e) {
            System.out.println(String.format("Exception thrown : %s : %s \n\n", e.getClass().getSimpleName(), e.getMessage()));

        }
    }
}
