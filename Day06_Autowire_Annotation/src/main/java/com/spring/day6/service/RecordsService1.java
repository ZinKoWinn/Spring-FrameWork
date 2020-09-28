package com.spring.day6.service;

import com.spring.day6.backup.DatabaseRecordBackUp;
import com.spring.day6.bls.DatabaseRecordProcessor;
import com.spring.day6.nonbean.RecordHash;
import com.spring.day6.nonbean.RecordUtil;
import com.spring.day6.nonbean.RecordValidator;
import com.spring.day6.reader.DatabaseRecordReader;
import com.spring.day6.writer.DatabaseRecordWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

//@Service
public class RecordsService1 {
    @Autowired
    public  DatabaseRecordBackUp databaseRecordBackUp;
    @Autowired
    protected DatabaseRecordProcessor databaseRecordProcessor;
    @Autowired
    private DatabaseRecordReader databaseRecordReader;
    @Autowired
    DatabaseRecordWriter databaseRecordWriter;
    @Autowired
    Optional<RecordUtil> recordUtil;
    @Nullable
    private RecordHash recordHash;
    @Autowired(required = false)
    private RecordValidator recordValidator;

    public RecordsService1(){

        System.out.println(
             getClass().getSimpleName() + "databaseRecordBackUp = " + databaseRecordBackUp + "\n" +
             getClass().getSimpleName() + "databaseRecordProcessor = " + databaseRecordProcessor + "\n" +
             getClass().getSimpleName() + "databaseRecordReader = " + databaseRecordReader + "\n" +
             getClass().getSimpleName() + "databaseRecordWriter = " + databaseRecordWriter + "\n" +
             getClass().getSimpleName() + "recordUtil = " + recordUtil + "\n" +
             getClass().getSimpleName() + "recordHash = " + recordHash + "\n" +
             getClass().getSimpleName() + "recordValidator = " + recordValidator + "\n"
        );

    }
    @PostConstruct
    public void init(){
        System.out.println(getClass().getSimpleName() + "databaseRecordBackUp = " + databaseRecordBackUp + "\n" +
                        getClass().getSimpleName() + "databaseRecordProcessor = " + databaseRecordProcessor + "\n" +
                        getClass().getSimpleName() + "databaseRecordReader = " + databaseRecordReader + "\n" +
                        getClass().getSimpleName() + "databaseRecordWriter = " + databaseRecordWriter + "\n" +
                        getClass().getSimpleName() + "recordUtil = " + recordUtil + "\n" +
                        getClass().getSimpleName() + "recordHash = " + recordHash + "\n" +
                        getClass().getSimpleName() + "recordValidator = " + recordValidator + "\n"
        );

    }

}
