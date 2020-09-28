package com.spring.day6.service;

import com.spring.day6.reader.RecordsReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService5 {
    @Autowired
    public void setRecordService5(List<RecordsReader> recordsReaderList){
        System.out.println(getClass().getSimpleName() + "setRecordService5");
        recordsReaderList.stream()
                .map(list -> "\t" + list.getClass().getSimpleName())
                .forEach(System.out::println);
    }
}
