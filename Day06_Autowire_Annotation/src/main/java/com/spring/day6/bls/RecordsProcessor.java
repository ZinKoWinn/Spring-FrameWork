package com.spring.day6.bls;

import com.spring.day6.ds.Record;

import java.util.Collection;

public interface RecordsProcessor {
    Collection<Record> recordProcessor(Collection<Record> records);
}
