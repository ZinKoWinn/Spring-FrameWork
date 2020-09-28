package com.spring.day6.writer;

import com.spring.day6.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public interface RecordsWriter {
    void recordsWriter(Collection<Record> records);
}
