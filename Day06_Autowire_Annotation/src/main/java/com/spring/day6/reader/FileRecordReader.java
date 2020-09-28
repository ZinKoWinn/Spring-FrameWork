package com.spring.day6.reader;

import com.spring.day6.ds.Record;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
@Order(1)
public class FileRecordReader implements  RecordsReader{
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
