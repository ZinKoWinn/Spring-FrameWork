package com.spring.day6.reader;

import com.spring.day6.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class DatabaseRecordReader implements  RecordsReader{
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
