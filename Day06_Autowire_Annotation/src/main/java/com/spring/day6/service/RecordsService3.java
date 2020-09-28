package com.spring.day6.service;

import com.spring.day6.bls.SocketRecordProcessor;
import com.spring.day6.nonbean.RecordHash;
import com.spring.day6.nonbean.RecordUtil;
import com.spring.day6.nonbean.RecordValidator;
import com.spring.day6.reader.SocketRecordReader;
import com.spring.day6.writer.SocketRecordWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
public class RecordsService3 {

    public RecordsService3(SocketRecordProcessor socketRecordProcessor, SocketRecordReader socketRecordReader, SocketRecordWriter socketRecordWriter){
        System.out.println(getClass().getSimpleName() + "socketRecordProcessor = " + socketRecordProcessor + "\n" +
                getClass().getSimpleName() + "socketRecordReader = " + socketRecordReader + "\n"+
                getClass().getSimpleName() + "socketRecordWriter = " + socketRecordWriter

        );
    }
    @Autowired
    public  RecordsService3(SocketRecordProcessor socketRecordProcessor, SocketRecordReader socketRecordReader,
                            SocketRecordWriter socketRecordWriter, Optional<RecordUtil>  recordUtil, @Nullable RecordHash recordHash,
                            @Autowired(required = false) RecordValidator recordValidator){
     System.out.println(getClass().getSimpleName() + "socketRecordProcessor = " + socketRecordProcessor + "\n" +
                    getClass().getSimpleName() + "socketRecordReader = " + socketRecordReader + "\n"+
                    getClass().getSimpleName() + "socketRecordWriter = " + socketRecordWriter + "\n"+
                    getClass().getSimpleName() + "recordUtil = " + recordUtil + "\n"+
                    getClass().getSimpleName() + "recordHash = " + recordHash + "\n"+
                    getClass().getSimpleName() + "recordValidator = " + recordValidator

            );
    }

}
