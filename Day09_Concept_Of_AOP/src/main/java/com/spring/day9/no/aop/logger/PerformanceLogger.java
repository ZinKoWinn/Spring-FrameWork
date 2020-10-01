package com.spring.day9.no.aop.logger;

import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.logging.Logger;
@Component
public class PerformanceLogger {
    private Logger logger = Logger.getLogger("performance.logger");

    public PerformanceLoggerInfo start(String name){
        return new PerformanceLoggerInfo(name,System.currentTimeMillis());
    }

    public  void stop(PerformanceLoggerInfo performanceLoggerInfo){
        long startTime = performanceLoggerInfo.getStartTime();
        long finishTime = System.currentTimeMillis();
        System.out.println(String.format("Duration of %s execution was %s",performanceLoggerInfo.getName(), Duration.ofMillis(finishTime - startTime)));

    }




    public static class PerformanceLoggerInfo{
        private  String name;
        private  long startTime;

        public PerformanceLoggerInfo(String name, long startTime) {
            this.name = name;
            this.startTime = startTime;
        }

        public String getName() {
            return name;
        }

        public long getStartTime() {
            return startTime;
        }
    }
}
