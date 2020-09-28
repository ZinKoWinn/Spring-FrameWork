package com.spring.day6.backup;

import com.spring.day6.ds.Record;

import java.util.Collection;

public interface RecordBackup {
    void backUpRecord(Collection<Record> records);
}
