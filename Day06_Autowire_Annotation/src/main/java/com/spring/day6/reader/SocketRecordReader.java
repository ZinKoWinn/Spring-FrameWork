package com.spring.day6.reader;

import com.spring.day6.ds.Record;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import java.util.Collection;
@Component
@Priority(2)
public class SocketRecordReader implements  RecordsReader{
    @Override
    public Collection<Record> readRecords() {
        return null;
    }
}
