package com.spring.day6.service;

import com.spring.day6.bls.FileRecordProcessor;
import com.spring.day6.reader.FileRecordReader;
import com.spring.day6.writer.FileRecordWriter;
import org.springframework.stereotype.Service;

//@Service
public class RecordsService2 {
    public RecordsService2(FileRecordProcessor fileRecordProcessor, FileRecordReader fileRecordReader, FileRecordWriter fileRecordWriter){

        System.out.println(getClass().getSimpleName() + "fileRecordProcessor = " + fileRecordProcessor + "\n" +
                getClass().getSimpleName() + "fileRecordReader = " + fileRecordReader + "\n" +
                getClass().getSimpleName() + "fileRecordWriter = " + fileRecordWriter

        );

    }
}
