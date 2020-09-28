package com.spring.day6.reader;

import com.spring.day6.ds.Record;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class WebServiceRecordReader implements  RecordsReader, Ordered {
    @Override
    public Collection<Record> readRecords() {
        return null;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
