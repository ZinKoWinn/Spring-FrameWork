package com.spring.day18.service;

import com.spring.day18.exception.ApplicationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DataSourceService {
    @Transactional
    public void methodWithUnCheckExceptionCausingRollBack() {
        throw new RuntimeException("Unchecked Exception that will cause rollback");

    }

    @Transactional
    public void methodWithCheckExceptionNotCauseRollback() throws ApplicationException {
        throw new ApplicationException("Checked Exception that will not cause rollback");
    }

    @Transactional(rollbackFor = ApplicationException.class)
    public void methodWithCheckExceptionCausingRollBack() throws ApplicationException {
        throw new ApplicationException("Checked Exception that will not cause rollback");
    }
}
