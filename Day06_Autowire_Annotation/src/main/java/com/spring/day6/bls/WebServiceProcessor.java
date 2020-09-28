package com.spring.day6.bls;

import com.spring.day6.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class WebServiceProcessor implements RecordsProcessor{
    @Override
    public Collection<Record> recordProcessor(Collection<Record> records) {
        return Collections.emptyList();
    }
}
