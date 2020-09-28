package com.spring.day6.reader;

import com.spring.day6.ds.Record;

import java.util.Collection;

public interface RecordsReader {
    Collection<Record> readRecords();
}
