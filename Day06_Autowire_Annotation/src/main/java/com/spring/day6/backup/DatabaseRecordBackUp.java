package com.spring.day6.backup;

import com.spring.day6.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DatabaseRecordBackUp implements  RecordBackup{
    @Override
    public void backUpRecord(Collection<Record> records) {

    }
}
