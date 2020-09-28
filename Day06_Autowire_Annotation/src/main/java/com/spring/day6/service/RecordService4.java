package com.spring.day6.service;

import com.spring.day6.bls.WebServiceProcessor;
import com.spring.day6.nonbean.RecordHash;
import com.spring.day6.nonbean.RecordUtil;
import com.spring.day6.nonbean.RecordValidator;
import com.spring.day6.reader.WebServiceRecordReader;
import com.spring.day6.writer.WebServiceRecordWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
public class RecordService4 {
    @Autowired
    public void setHasBean(WebServiceProcessor webServiceProcessor, WebServiceRecordReader webServiceRecordReader, WebServiceRecordWriter webServiceRecordWriter){
        System.out.println(getClass().getSimpleName() + "WebServiceProcessor = " + webServiceProcessor + "\n" +
                getClass().getSimpleName() + "WebServiceProcessor = " + webServiceProcessor + "\n" +
                getClass().getSimpleName() + "WebServiceProcessor = " + webServiceProcessor

        );
    }

    @Autowired
    public void setHasBeanAndNonBean(WebServiceProcessor webServiceProcessor, WebServiceRecordReader webServiceRecordReader,
                                     WebServiceRecordWriter webServiceRecordWriter, Optional<RecordUtil> recordUtil, @Nullable RecordHash recordHash,
                                     @Autowired(required = false)RecordValidator recordValidator){
        System.out.println(getClass().getSimpleName() + "WebServiceProcessor = " + webServiceProcessor + "\n" +
                getClass().getSimpleName() + "WebServiceProcessor = " + webServiceProcessor + "\n" +
                getClass().getSimpleName() + "WebServiceProcessor = " + webServiceProcessor + "\n" +
                getClass().getSimpleName() + "RecordUtil = " + recordUtil + "\n" +
                getClass().getSimpleName() + "RecordHash = " + recordHash +"\n" +
                getClass().getSimpleName() + "RecordValidator = " +recordValidator
        );
    }

}
